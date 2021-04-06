package com.github.galimru.boostrsdk.api;

import com.github.galimru.boostrsdk.model.UserToken;
import com.github.galimru.boostrsdk.model.UserTokenResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface UserTokenApi {
  /**
   * Get token of user
   *            Please note that only Admins may generate tokens.            Headers            Accept: application/vnd.boostr.public            Example of Request            {\&quot;auth\&quot;:             {               \&quot;email\&quot;: \&quot;my@email.com\&quot;,               \&quot;password\&quot;: \&quot;my password\&quot;             }           }
   * @param wrapper  (optional)
   * @return Call&lt;UserTokenResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/user_token")
  Call<UserTokenResponse> getUserToken(
          @Body UserToken.Wrapper wrapper
  );

}
