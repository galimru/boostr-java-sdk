package com.github.galimru.boostrsdk.api;

import com.github.galimru.boostrsdk.model.Lead;
import com.github.galimru.boostrsdk.model.LeadResponse;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface LeadsApi {
  /**
   * Get collection of Leads
   *     Example of Request     http://localhost/api/leads?page&#x3D;5&amp;per&#x3D;2     http://localhost/api/leads?created_at&#x3D;2019-01-01&amp;created_at_condition&lt;&#x3D;     http://localhost/api/leads?created_at&#x3D;2019-01-01T10:11:12&amp;created_at_condition&gt;&#x3D;     http://localhost/api/leads?updated_at&#x3D;2019-02-02&amp;updated_at_condition&gt;&#x3D;     http://localhost/api/leads?updated_at&#x3D;2019-02-02T:14:22:18&amp;updated_at_condition&gt;&#x3D;
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
   * @return Call&lt;List&lt;LeadResponse&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("api/leads")
  Call<List<LeadResponse>> list(
          @Query("id") Integer id, @Query("page") Integer page, @Query("per") Integer per, @Query("created_at") Object createdAt, @Query("created_at_condition") String createdAtCondition, @Query("updated_at") Object updatedAt, @Query("updated_at_condition") String updatedAtCondition, @Query("created_at_start") Object createdAtStart, @Query("created_at_end") Object createdAtEnd, @Query("updated_at_start") Object updatedAtStart, @Query("updated_at_end") Object updatedAtEnd
  );

  /**
   * Delete a single Lead
   *       Example of Request        http://localhost/api/leads/3  
   * @param id  (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("api/leads/{id}")
  Call<Void> delete(
          @Path("id") Integer id
  );

  /**
   * Get a single Lead
   *       Example of Request        http://localhost/api/leads/1  
   * @param id  (required)
   * @return Call&lt;LeadResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("api/leads/{id}")
  Call<LeadResponse> get(
          @Path("id") Integer id
  );

  /**
   * Update a single Lead
   *           Headers            Accept: application/vnd.boostr.public            Example of Request           {\&quot;lead\&quot;:             {               \&quot;email\&quot;: \&quot;email@gmail.com\&quot;,               \&quot;first_name\&quot;: \&quot;James\&quot;,               \&quot;last_name\&quot;: \&quot;Bond\&quot;,               \&quot;title\&quot;: \&quot;Title of Lead\&quot;,               \&quot;company_name\&quot;: \&quot;My Company\&quot;,               \&quot;country\&quot;: \&quot;USA\&quot;,               \&quot;budget\&quot;: \&quot;10000\&quot;,               \&quot;source_url\&quot;: \&quot;https://boostr.com/\&quot;,               \&quot;status\&quot;: \&quot;accepted\&quot;,               \&quot;state\&quot;: \&quot;state\&quot;,               \&quot;product_name\&quot;: \&quot;MyProduct\&quot;,               \&quot;notes\&quot;: \&quot;Some notes\&quot;,               \&quot;rejected_reason\&quot;: \&quot;Some reason\&quot;,               \&quot;account_id\&quot;: 1,               \&quot;contact_id\&quot;: 2,               \&quot;user_id\&quot;: 3,               \&quot;source\&quot;: {\&quot;name\&quot;: \&quot;Name of Source\&quot;, \&quot;info\&quot;: \&quot;Info of Source\&quot;, \&quot;url\&quot;: \&quot;https://boostr.com\&quot;}             }           } 
   * @param id  (required)
   * @param wrapper  (optional)
   * @return Call&lt;LeadResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/leads/{id}")
  Call<LeadResponse> update(
          @Path("id") Integer id, @Body Lead.Wrapper wrapper
  );

  /**
   * Create a single Lead
   *           Headers            Accept: application/vnd.boostr.public            Example of Request           {\&quot;lead\&quot;:             {               \&quot;email\&quot;: \&quot;email@gmail.com\&quot; (required),               \&quot;first_name\&quot;: \&quot;James\&quot;,               \&quot;last_name\&quot;: \&quot;Bond\&quot;,               \&quot;title\&quot;: \&quot;Title of Lead\&quot;,               \&quot;company_name\&quot;: \&quot;My Company\&quot;,               \&quot;country\&quot;: \&quot;USA\&quot;,               \&quot;budget\&quot;: \&quot;10000\&quot;,               \&quot;source_url\&quot;: \&quot;https://boostr.com/\&quot;,               \&quot;status\&quot;: \&quot;accepted\&quot;,               \&quot;state\&quot;: \&quot;Texas\&quot;,               \&quot;product_name\&quot;: \&quot;MyProduct\&quot;,               \&quot;notes\&quot;: \&quot;Some notes\&quot;,               \&quot;rejected_reason\&quot;: \&quot;Some reason\&quot;,               \&quot;account_id\&quot;: 1,               \&quot;contact_id\&quot;: 2,               \&quot;user_id\&quot;: 3,               \&quot;source\&quot;: {\&quot;name\&quot;: \&quot;Name of Source\&quot;, \&quot;info\&quot;: \&quot;Info of Source\&quot;, \&quot;url\&quot;: \&quot;https://boostr.com\&quot;}             }           }
   * @param wrapper  (optional)
   * @return Call&lt;LeadResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/leads/")
  Call<LeadResponse> create(
          @Body Lead.Wrapper wrapper
  );

}
