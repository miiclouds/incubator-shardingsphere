/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.core.rewrite.token.generator;

import org.apache.shardingsphere.core.optimize.api.statement.OptimizedStatement;
import org.apache.shardingsphere.core.rewrite.builder.parameter.ParameterBuilder;
import org.apache.shardingsphere.core.rewrite.token.pojo.SQLToken;
import org.apache.shardingsphere.core.rule.BaseRule;

import java.util.Collection;

/**
 * SQL token generator for collection.
 *
 * @author zhangliang
 * @author panjuan
 * 
 * @param <T> type of rule 
 */
public interface CollectionSQLTokenGenerator<T extends BaseRule> extends SQLTokenGenerator {
    
    /**
     * Generate SQL tokens.
     * 
     * @param optimizedStatement optimized statement
     * @param parameterBuilder SQL parameter builder
     * @param rule rule
     * @param isQueryWithCipherColumn is query with cipher column
     * @return SQL tokens
     */
    Collection<? extends SQLToken> generateSQLTokens(OptimizedStatement optimizedStatement, ParameterBuilder parameterBuilder, T rule, boolean isQueryWithCipherColumn);
}
