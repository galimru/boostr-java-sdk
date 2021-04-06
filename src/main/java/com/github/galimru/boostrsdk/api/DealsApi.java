package com.github.galimru.boostrsdk.api;

import com.github.galimru.boostrsdk.model.DateCondition;
import com.github.galimru.boostrsdk.model.Deal;
import com.github.galimru.boostrsdk.model.DealResponse;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface DealsApi {
  /**
   * Get a single Deal
   * 
   * @param dealId  (required)
   * @return Call&lt;DealResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("api/deals/{deal_id}")
  Call<DealResponse> get(
          @Path("deal_id") Integer dealId
  );

  /**
   * Update a single Deal
   *           Headers            Accept: application/vnd.boostr.public            Example of Request            {             \&quot;deal\&quot;: {               \&quot;name\&quot;: \&quot;Deal\&quot;,               \&quot;type\&quot;: \&quot;Type\&quot;,               \&quot;source\&quot;: \&quot;Source\&quot;,               \&quot;next_steps\&quot;: \&quot;Next Steps\&quot;,               \&quot;start_date\&quot;: \&quot;2019-01-01\&quot;,               \&quot;end_date\&quot;: \&quot;2019-02-01\&quot;,               \&quot;stage_id\&quot;: 1,               \&quot;budget\&quot;: 1000,               \&quot;budget_loc\&quot;: 1000,               \&quot;currency\&quot;: \&quot;USD\&quot;,               \&quot;lead_id\&quot;: 1,               \&quot;advertiser_id\&quot;: 2 (required),               \&quot;agency_id\&quot;: 3 (required if Validation is TRUE),               \&quot;custom_fields\&quot;: {                 \&quot;custom\&quot;: \&quot;custom_value\&quot;               },               \&quot;integrations_attributes\&quot;: [                 {                   \&quot;id\&quot;: 1,                   \&quot;external_id\&quot;: 3423,                   \&quot;external_type\&quot;: \&quot;operative\&quot;                 }               ],              \&quot;deal_members\&quot;: [{\&quot;id\&quot;: 1,                                 \&quot;email\&quot;: \&quot;member1@email.com\&quot;,                                 \&quot;share\&quot;: 100,                                 \&quot;type\&quot;: \&quot;Type of User\&quot;}],               \&quot;deal_contacts\&quot;: [{\&quot;id\&quot;: \&quot;id of contact\&quot;,                                  \&quot;name\&quot;: \&quot;name of contact\&quot;,                                  \&quot;email\&quot;: \&quot;email of contacts address\&quot;,                                  \&quot;position\&quot;: \&quot;position\&quot;,                                  \&quot;role\&quot;: \&quot;role\&quot; }]             }           } 
   * @param dealId  (required)
   * @param wrapper  (optional)
   * @return Call&lt;DealResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/deals/{deal_id}")
  Call<DealResponse> update(
          @Path("deal_id") Integer dealId, @Body Deal.Wrapper wrapper
  );

  /**
   * Get a paginated list of Deals
   *     Example of Request     http://localhost/api/deals?page&#x3D;5&amp;per&#x3D;2     http://localhost/api/deals?created_at&#x3D;2019-01-01&amp;created_at_condition&lt;&#x3D;     http://localhost/api/deals?created_at&#x3D;2019-01-01T10:11:12&amp;created_at_condition&gt;&#x3D;     http://localhost/api/deals?updated_at&#x3D;2019-02-02&amp;updated_at_condition&gt;&#x3D;     http://localhost/api/deals?updated_at&#x3D;2019-02-02T:14:22:18&amp;updated_at_condition&gt;&#x3D;
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
   * @param deletedAt Deleted Date of Item (optional)
   * @param deletedAtCondition &lt;, &gt;, &lt;&#x3D;, &gt;&#x3D;, &#x3D;, default: &#x3D; (optional)
   * @param closedAt Close Date of Item (optional)
   * @param closedAtCondition &lt;, &gt;, &lt;&#x3D;, &gt;&#x3D;, &#x3D;, default: &#x3D;  (optional)
   * @return Call&lt;List&lt;DealResponse&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("api/deals")
  Call<List<DealResponse>> list(
          @Query("id") Integer id, @Query("page") Integer page, @Query("per") Integer per, @Query("created_at") Object createdAt, @Query("created_at_condition") DateCondition createdAtCondition, @Query("updated_at") Object updatedAt, @Query("updated_at_condition") DateCondition updatedAtCondition, @Query("created_at_start") Object createdAtStart, @Query("created_at_end") Object createdAtEnd, @Query("updated_at_start") Object updatedAtStart, @Query("updated_at_end") Object updatedAtEnd, @Query("deleted_at") Object deletedAt, @Query("deleted_at_condition") DateCondition deletedAtCondition, @Query("closed_at") Object closedAt, @Query("closed_at_condition") DateCondition closedAtCondition
  );

  /**
   * Create a single Deal
   *           Headers            Accept: application/vnd.boostr.public            Example of Request            {             \&quot;deal\&quot;: {               \&quot;name\&quot;: \&quot;Deal\&quot; (required),               \&quot;type\&quot;: \&quot;Type\&quot;,               \&quot;source\&quot;: \&quot;Source\&quot;,               \&quot;next_steps\&quot;: \&quot;Next Steps\&quot;,               \&quot;start_date\&quot;: \&quot;2019-01-01\&quot; (required),               \&quot;end_date\&quot;: \&quot;2019-02-01\&quot; (required),               \&quot;stage_id\&quot;: 1 (required),               \&quot;budget\&quot;: 1000,               \&quot;budget_loc\&quot;: 1000,               \&quot;currency\&quot;: \&quot;USD\&quot;,               \&quot;lead_id\&quot;: 1,               \&quot;advertiser_id\&quot;: 2 (required),               \&quot;agency_id\&quot;: 3 (required if Validation is TRUE),               \&quot;custom_fields\&quot;: {                 \&quot;custom\&quot;: \&quot;custom_value\&quot;               },               \&quot;deal_members\&quot;: [{\&quot;id\&quot;: 1,                                 \&quot;email\&quot;: \&quot;member1@email.com\&quot;,                                 \&quot;share\&quot;: 100,                                 \&quot;type\&quot;: \&quot;Type of User\&quot;}],               \&quot;deal_contacts\&quot;: [{\&quot;id\&quot;: \&quot;id of contact\&quot;,                                  \&quot;name\&quot;: \&quot;name of contact\&quot;,                                  \&quot;email\&quot;: \&quot;email of contacts address\&quot;,                                  \&quot;position\&quot;: \&quot;position\&quot;,                                  \&quot;role\&quot;: \&quot;role\&quot; }],               \&quot;integrations_attributes\&quot;: [                 {                   \&quot;external_type\&quot;: \&quot;operative\&quot;,                   \&quot;external_id\&quot;: 3333                 }               ]             }           }
   * @param wrapper  (optional)
   * @return Call&lt;DealResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/deals")
  Call<DealResponse> create(
          @Body Deal.Wrapper wrapper
  );

}
