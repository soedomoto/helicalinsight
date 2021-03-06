/**
 *    Copyright (C) 2013-2017 Helical IT Solutions (http://www.helicalinsight.com) - All rights reserved.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.helicalinsight.datasource.managed;


/**
 * Created by author on 13-Dec-14.
 *
 * @author Rajasekhar
 */
public class PoolUtils {

    public static HashMapKey newMapKey(String json) {
        String dataSourceProvider = JsonUtils.getKeyFromJson(json, "dataSourceProvider");
        String jdbcUrl = JsonUtils.extractUrl(json);
        String userName = JsonUtils.extractUserName(json);
        String password = JsonUtils.extractPassword(json);
        String driverName = JsonUtils.extractDriverName(json);
        return new HashMapKey(jdbcUrl, dataSourceProvider, userName, password, driverName);
    }
}
