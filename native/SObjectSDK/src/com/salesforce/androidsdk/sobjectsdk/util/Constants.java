/*
 * Copyright (c) 2014, salesforce.com, inc.
 * All rights reserved.
 * Redistribution and use of this software in source and binary forms, with or
 * without modification, are permitted provided that the following conditions
 * are met:
 * - Redistributions of source code must retain the above copyright notice, this
 * list of conditions and the following disclaimer.
 * - Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 * - Neither the name of salesforce.com, inc. nor the names of its contributors
 * may be used to endorse or promote products derived from this software without
 * specific prior written permission of salesforce.com, inc.
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package com.salesforce.androidsdk.sobjectsdk.util;

/**
 * This class contains commonly used constants, such as field names,
 * SObject types, attribute names, etc.
 *
 * @author bhariharan
 */
public class Constants {

	public static final String EMPTY_STRING = "";
	public static final String NULL_STRING = "null";

    public static final String ID = "Id";
    public static final String NAME = "Name";
    public static final String TYPE = "Type";
    public static final String ATTRIBUTES = "attributes";

    /**
     * Salesforce object types.
     */
    public static final String ACCOUNT = "Account";
    public static final String LEAD = "Lead";
    public static final String CASE = "Case";
    public static final String OPPORTUNITY = "Opportunity";
    public static final String OPPORTUNITY_LINE_ITEM = "OpportunityLineItem";
    public static final String TASK = "Task";
    public static final String CONTACT = "Contact";
    public static final String CAMPAIGN = "Campaign";
    public static final String USER = "User";
    public static final String USER_PROFILE = "UserProfile";
    public static final String GROUP = "CollaborationGroup";
    public static final String DASHBOARD = "Dashboard";
    public static final String CONTENT = "ContentDocument";
    public static final String CONTENT_VERSION = "ContentVersion";
    public static final String CONTRACT = "Contract";
    public static final String LIVE_CHAT_TRANSCRIPT = "LiveChatTranscript";
    public static final String PROCESS_INSTANCE_STEP = "ProcessInstanceStep";
    public static final String EXTERNAL_EVENT = "ExternalEvent";
    public static final String EVENT = "Event";
    public static final String FEED_ITEM = "FeedItem";
    public static final String FEED_COMMENT = "FeedComment";
    public static final String KNOWLEDGE_ARTICLE_VERSION = "KnowledgeArticleVersion";
    public static final String NOTE = "Note";

    public static final String RECENTLY_VIEWED = "RecentlyViewed";
}
