package com.github.galimru.boostrsdk.model;

import java.time.OffsetDateTime;
import java.util.Objects;

public class Filter {

    private final Integer id;
    private final OffsetDateTime updatedAt;
    private final DateCondition updatedAtCondition;
    private final OffsetDateTime createdAt;
    private final DateCondition createdAtCondition;
    private final OffsetDateTime deletedAt;
    private final DateCondition deletedAtCondition;
    private final OffsetDateTime closedAt;
    private final DateCondition closedAtCondition;
    private final OffsetDateTime updatedAtStart;
    private final OffsetDateTime updatedAtEnd;
    private final OffsetDateTime createdAtStart;
    private final OffsetDateTime createdAtEnd;

    public static Builder builder() {
        return new Builder();
    }

    public static Filter empty() {
        return builder().build();
    }

    public Filter(Builder builder) {
        this.id = builder.id;
        this.updatedAt = builder.updatedAt;
        this.updatedAtCondition = builder.updatedAtCondition;
        this.createdAt = builder.createdAt;
        this.createdAtCondition = builder.createdAtCondition;
        this.deletedAt = builder.deletedAt;
        this.deletedAtCondition = builder.deletedAtCondition;
        this.closedAt = builder.closedAt;
        this.closedAtCondition = builder.closedAtCondition;
        this.updatedAtStart = builder.updatedAtStart;
        this.updatedAtEnd = builder.updatedAtEnd;
        this.createdAtStart = builder.createdAtStart;
        this.createdAtEnd = builder.createdAtEnd;
    }

    public Integer getId() {
        return id;
    }

    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public DateCondition getUpdatedAtCondition() {
        return updatedAtCondition;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public DateCondition getCreatedAtCondition() {
        return createdAtCondition;
    }

    public OffsetDateTime getDeletedAt() {
        return deletedAt;
    }

    public DateCondition getDeletedAtCondition() {
        return deletedAtCondition;
    }

    public OffsetDateTime getClosedAt() {
        return closedAt;
    }

    public DateCondition getClosedAtCondition() {
        return closedAtCondition;
    }

    public OffsetDateTime getUpdatedAtStart() {
        return updatedAtStart;
    }

    public OffsetDateTime getUpdatedAtEnd() {
        return updatedAtEnd;
    }

    public OffsetDateTime getCreatedAtStart() {
        return createdAtStart;
    }

    public OffsetDateTime getCreatedAtEnd() {
        return createdAtEnd;
    }

    public static class Builder {

        private Integer id;
        private OffsetDateTime updatedAt;
        private DateCondition updatedAtCondition;
        private OffsetDateTime createdAt;
        private DateCondition createdAtCondition;
        private OffsetDateTime deletedAt;
        private DateCondition deletedAtCondition;
        private OffsetDateTime closedAt;
        private DateCondition closedAtCondition;
        private OffsetDateTime updatedAtStart;
        private OffsetDateTime updatedAtEnd;
        private OffsetDateTime createdAtStart;
        private OffsetDateTime createdAtEnd;

        public Builder byId(Integer id) {
            this.id = id;
            return this;
        }

        public Builder byUpdatedAt(DateCondition condition, OffsetDateTime updatedAt) {
            Objects.requireNonNull(condition, "condition is null");
            Objects.requireNonNull(updatedAt, "updatedAt is null");
            this.updatedAtCondition = condition;
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder byCreatedAt(DateCondition condition, OffsetDateTime createdAt) {
            Objects.requireNonNull(condition, "condition is null");
            Objects.requireNonNull(createdAt, "createdAt is null");
            this.createdAtCondition = condition;
            this.createdAt = createdAt;
            return this;
        }

        public Builder byDeletedAt(DateCondition condition, OffsetDateTime deletedAt) {
            Objects.requireNonNull(condition, "condition is null");
            Objects.requireNonNull(deletedAt, "deletedAt is null");
            this.deletedAtCondition = condition;
            this.deletedAt = deletedAt;
            return this;
        }

        public Builder byClosedAt(DateCondition condition, OffsetDateTime closedAt) {
            Objects.requireNonNull(condition, "condition is null");
            Objects.requireNonNull(closedAt, "closedAt is null");
            this.closedAtCondition = condition;
            this.closedAt = closedAt;
            return this;
        }

        public Builder byUpdatedAtRange(OffsetDateTime startDate, OffsetDateTime endDate) {
            Objects.requireNonNull(startDate, "startDate is null");
            Objects.requireNonNull(endDate, "endDate is null");
            this.updatedAtStart = startDate;
            this.updatedAtEnd = endDate;
            return this;
        }

        public Builder byCreatedAtRange(OffsetDateTime startDate, OffsetDateTime endDate) {
            Objects.requireNonNull(startDate, "startDate is null");
            Objects.requireNonNull(endDate, "endDate is null");
            this.createdAtStart = startDate;
            this.createdAtEnd = endDate;
            return this;
        }

        public Filter build() {
            return new Filter(this);
        }
    }
}
