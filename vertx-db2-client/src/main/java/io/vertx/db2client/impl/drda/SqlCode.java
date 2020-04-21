/*
 * Copyright (C) 2019,2020 IBM Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.vertx.db2client.impl.drda;

/**
 * Possible values are documented at:
 * <a href="https://www.ibm.com/support/knowledgecenter/SSEPEK_11.0.0/codes/src/tpc/db2z_n.html">
 * DB2 SQL Codes</a>
 */
public class SqlCode {
	
	// TODO: @AGG Convert this class to an interface with constants
	
	public static final int CONNECTION_REFUSED = -4499;
	public static final int RDB_NOT_FOUND = -30061;
	public static final int INVALID_CREDENTIALS = -4214;
	public static final int MISSING_CREDENTIALS = -4461;
	
    private int code_;

    SqlCode(int code) {
        code_ = code;
    }

    /**
     * Return the SQL code represented by this instance.
     *
     * @return an SQL code
     */
    public final int getCode() {
        return code_;
    }

    public final static SqlCode queuedXAError = new SqlCode(-4203);

    public final static SqlCode disconnectError = new SqlCode(40000);

    /** SQL code for SQL state 02000 (end of data). DRDA does not
     * specify the SQL code for this SQL state, but Derby/DB2 uses 100. */
    public final static SqlCode END_OF_DATA = new SqlCode(100);
}