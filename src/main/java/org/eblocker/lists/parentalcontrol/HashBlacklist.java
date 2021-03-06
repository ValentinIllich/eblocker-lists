/*
 * Copyright 2020 eBlocker Open Source UG (haftungsbeschraenkt)
 *
 * Licensed under the EUPL, Version 1.2 or - as soon they will be
 * approved by the European Commission - subsequent versions of the EUPL
 * (the "License"); You may not use this work except in compliance with
 * the License. You may obtain a copy of the License at:
 *
 *   https://joinup.ec.europa.eu/page/eupl-text-11-12
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.eblocker.lists.parentalcontrol;

import java.time.LocalDateTime;
import java.util.Set;

public class HashBlacklist implements Blacklist<byte[]> {

    private final LocalDateTime date;
    private final Set<byte[]> hashes;
    private final String hashFunctionName;

    public HashBlacklist(LocalDateTime date, Set<byte[]> hashes, String hashFunctionName) {
        this.date = date;
        this.hashes = hashes;
        this.hashFunctionName = hashFunctionName;
    }

    @Override
    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public String getFormat() {
        return "domainblacklist/hash-" + hashFunctionName;
    }

    @Override
    public Set<byte[]> getList() {
        return hashes;
    }

    public String getHashFunctionName() {
        return hashFunctionName;
    }
}
