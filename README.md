


# 🅱️ boostr-java-sdk

[![](https://jitpack.io/v/galimru/boostr-java-sdk.svg)](https://jitpack.io/#galimru/boostr-java-sdk)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

Boostr Java SDK client library to interact with [boostr.com](https://www.boostr.com)

---

## Installation

Import the library to your project using [jitpack](https://jitpack.io/#galimru/boostr-java-sdk/1.0.0) repository

#### Gradle

1. Add the JitPack repository to your build file

```gradle
repositories {
    ...
    maven { url 'https://jitpack.io' }
}
```

2. Add the boostr-java-sdk library dependency

```gradle
implementation 'com.github.galimru:boostr-java-sdk:1.0.0'
```

_Note: The JitPack supports both Gradle/Maven build tools, please refer to jitpack [documentation](https://jitpack.io/#galimru/boostr-java-sdk) if you want use Maven_


## Dead simple example

```java
         // create api client for sandbox environment
        Credentials credentials = Credentials.of("<YOUR_USERNAME>", "<YOUR_PASSWORD>");
        BoostrClient client = BoostrClient.create(credentials, true);
        // get list of all deals
        List<DealResponse> deals = client.deals().list();
        // extract deal id from a deal
        Integer dealId = deals.get(0).getId();
        // update deal name by deal id
        Deal deal = new Deal();
        deal.setName("Changed Deal Name");
        client.deals().update(dealId, deal);
```

## License

Apache License 2.0

_Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License._


## Links

[Boostr.com](https://www.boostr.com)

[Swagger API](https://app.boostr.com/api-docs/index.html)
