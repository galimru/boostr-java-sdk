package com.github.galimru.boostrsdk.api;

import com.github.galimru.boostrsdk.model.DateCondition;
import com.github.galimru.boostrsdk.model.User;
import com.github.galimru.boostrsdk.model.UserList;
import com.github.galimru.boostrsdk.model.UserResponse;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface UsersApi {
  /**
   * Get collection of users
   *     Example of Request     http://localhost/api/users?page&#x3D;5&amp;per&#x3D;2     http://localhost/api/users?created_at&#x3D;2019-01-01&amp;created_at_condition&lt;&#x3D;     http://localhost/api/users?created_at&#x3D;2019-01-01T10:11:12&amp;created_at_condition&gt;&#x3D;     http://localhost/api/users?updated_at&#x3D;2019-02-02&amp;updated_at_condition&gt;&#x3D;     http://localhost/api/users?updated_at&#x3D;2019-02-02T:14:22:18&amp;updated_at_condition&gt;&#x3D;
   * @param id id of object (optional)
   * @param page number of page (optional)
   * @param per items per page (default: 50) (optional)
   * @param createdAt Created Date of Item (optional)
   * @param createdAtCondition &lt;, &gt;, &lt;&#x3D;, &gt;&#x3D;, &#x3D;, default: &#x3D; (optional)
   * @param updatedAt Date of most recent update of Item (optional)
   * @param updatedAtCondition &lt;, &gt;, &lt;&#x3D;, &gt;&#x3D;, &#x3D;, default: &#x3D; (optional)
   * @param createdAtStart &#39;YYYY-MM-DD&#39; :created_at BETWEEN start(this)..end (optional)
   * @param createdAtEnd &#39;YYYY-MM-DD&#39; :created_at BETWEEN start..end(this) (optional)
   * @param updatedAtStart &#39;YYYY-MM-DD&#39; :updated_at BETWEEN start(this)..end (optional)
   * @param updatedAtEnd &#39;YYYY-MM-DD&#39; :updated_at BETWEEN start..end(this) (optional)
   * @return Call&lt;UsersResponse&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("api/users")
  Call<List<UserResponse>> list(
          @Query("id") Integer id, @Query("page") Integer page, @Query("per") Integer per, @Query("created_at") Object createdAt, @Query("created_at_condition") DateCondition createdAtCondition, @Query("updated_at") Object updatedAt, @Query("updated_at_condition") DateCondition updatedAtCondition, @Query("created_at_start") Object createdAtStart, @Query("created_at_end") Object createdAtEnd, @Query("updated_at_start") Object updatedAtStart, @Query("updated_at_end") Object updatedAtEnd
  );

  /**
   * Get a single user
   *       Example of Request        http://localhost/api/users/1  
   * @param id  (required)
   * @return Call&lt;UserResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("api/users/{id}")
  Call<UserResponse> get(
          @Path("id") Integer id
  );

  /**
   * Update a single User
   *           Headers            Accept: application/vnd.boostr.public            Example of Request           {             \&quot;user\&quot;: {               \&quot;first_name\&quot;: \&quot;First Name\&quot;,               \&quot;last_name\&quot;: \&quot;Last Name\&quot;,               \&quot;email\&quot;: \&quot;email@email.com\&quot;,               \&quot;win_rate\&quot;: 100,               \&quot;title\&quot;: \&quot;some title\&quot;,               \&quot;average_deal_size\&quot;: 3,               \&quot;type\&quot;: \&quot;Default\&quot;,               \&quot;is_active\&quot;: true             }           } 
   * @param id  (required)
   * @param wrapper  (optional)
   * @return Call&lt;UserResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/users/{id}")
  Call<UserResponse> update(
          @Path("id") Integer id, @Body User.Wrapper wrapper
  );

  /**
   * Create a single User
   *           Headers            Accept: application/vnd.boostr.public            Example of Request           {             \&quot;user\&quot;: {               \&quot;first_name\&quot;: \&quot;First Name\&quot; (required),               \&quot;last_name\&quot;: \&quot;Last Name\&quot; (required),               \&quot;email\&quot;: \&quot;email@email.com\&quot; (required),               \&quot;title\&quot;: \&quot;some title\&quot;,               \&quot;average_deal_size\&quot;: 3,               \&quot;type\&quot;: \&quot;Default\&quot;,               \&quot;is_active\&quot;: true             }           }
   * @param wrapper  (optional)
   * @return Call&lt;UserResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/users")
  Call<UserResponse> create(
          @Body User.Wrapper wrapper
  );

}
