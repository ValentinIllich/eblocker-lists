eblocker-lists
==============

Package for pattern, dns and malware filter lists.

Build
-----

To build a package containing up-to-date lists:

`mvn package -Pupdate-lists`

Layout
------

The built package contains two directories, `lists` and `lists_src`. The former contains metadata / lists in formats ready for use while the latter contains source files which needs processing by the eBlocker server on import.

| Path                                        | Description                                                         | Source    |
| ------------------------------------------- | ------------------------------------------------------------------- | --------- |
| `lists_src/`                                | Downloaded files parsed on import for Pattern Filters.              |           |
| `lists_src/easylistgermany.txt_src`         | Easylist germany                                                    | Download  |
| `lists_src/easylist.txt_src`                | Easylist                                                            | Download  |
| `lists_src/easyprivacy.txt_src`             | Easylist Privacy                                                    | Download  |
| `lists_src/eblocker-filter.txt_src`         | eBlocker Ads patterns                                               | Source    |
| `lists_src/tracking-redirect.txt_src`       | eBlocker Tracking patterns                                          | Source    |
| `lists`                                     | Ready to use filters                                                |           |
| `lists/appModules.json`                     | Trusted Apps / Websites Definition  (I18N)                          | Source    |
| `lists/squidblacklist.org`                  | DNS filters                                                         |           |
| `lists/squidblacklist.org/*.bloom`          | Bloom filter for domain filter                                      | Generated |
| `lists/squidblacklist.org/*.filter`         | Domain filter                                                       | Generated |
| `lists/parentalcontrol-filter.json`         | Metadata for DNS filters                                            | Generated |
| `lists/malware-urls.json`                   | Metadata and URLS for malware filter                                | Generated |
| `lists/malware-ip-ports.json`               | Metadata and Hosts for malware filter                               | Generated |
| `lists/intermediate.pem`                    | Mozillas list of intermediate CA certificates                       | Generated |
| `lists/parentalcontrol-search-engines.json` | Search engine configured for Dashboard / Access Denied Page  (I18N) | Source    |

Filter / Lists Configuration
----------------------------

Configuration for downloaded /generated files and additional source files are located in `/src/main/resources`:

| Path                                                    | Filter/List      | Description                                 |
| ------------------------------------------------------- | ---------------- | ------------------------------------------- |
| `src/main/resources/eBlocker-ads-blacklist.txt`         | DNS              | eBlocker maintained ad blacklist            |
| `src/main/resources/eBlocker-ads-whitelist.txt`         | DNS              | eBlocker maintained ad whitelist            |
| `src/main/resources/eBlocker-fragFINN-whitelist.txt`    | DNS              | eBlocker additions to FragFINN              |
| `src/main/resources/eblocker-malware.json`              | Malware          | eBlocker additions to Malware lists         | 
| `src/main/resources/lists.properties`                   | Pattern          | Easylist downloads                          |
| `src/main/resources/malware.properties`                 | Malware          | Malware configuration                       |
| `src/main/resources/parentalcontrol-filter-config.json` | DNS              | DNS filters configuration (I18N)            |
| `src/main/resources/rule_test_eblocker.csv`             | Pattern          | Test data for checking easylist on download |
| `src/main/resources/rule_tests_alexa_top10_de.txt`      | Pattern          | Test data for checking easylist on download |
| `src/main/resources/squidblacklists.properties`         | DNS              | squidblackist.org access configuration      |
| `src/main/resources/tls.properties`                     | Intermediate CAs | Intermediate CA list download configuration |
| `src/main/resources/umbrella-easylistgermany.txt`       | DNS              | Domains filtered by Easylist Germany (*)    |
| `src/main/resources/umbrella-easylist.txt`              | DNS              | Domains filtered by Easylist (*)            |
| `src/main/resources/umbrella-easyprivacy.txt`           | DNS              | Domains filtered by Easyprivacy (*)         |

(*) these lists are actually generated by `org.eblocker.lists.parentalcontrol.provider.EasyListDomainProvider` and manually updated due to performance reasons.

(I18N) these lists contain localized texts that are visible to end users.