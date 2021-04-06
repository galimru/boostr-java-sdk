package com.github.galimru.boostrsdk.converters;

import com.google.gson.annotations.SerializedName;
import retrofit2.Converter;
import retrofit2.Retrofit;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

public class EnumConverterFactory extends Converter.Factory {

    @Nullable
    @Override
    public Converter<?, String> stringConverter(@Nonnull Type type,
                                                @Nonnull Annotation[] annotations,
                                                @Nonnull Retrofit retrofit) {
        if (type instanceof Class && ((Class<?>)type).isEnum()) {
            return new EnumConverter();
        }
        return null;
    }

    public static EnumConverterFactory create() {
        return new EnumConverterFactory();
    }

    private static class EnumConverter implements Converter<Enum<?>, String> {

        @Nullable
        @Override
        public String convert(@Nonnull Enum<?> value) throws IOException {
            return getSerializedNameValue(value);
        }

        public String getSerializedNameValue(Enum<?> caller) {
            try {
                SerializedName serializedName = caller.getClass().getField(caller.name())
                        .getAnnotation(SerializedName.class);
                return serializedName != null ? serializedName.value() : caller.name();
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
