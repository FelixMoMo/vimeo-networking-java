package com.vimeo.networking2.enums

/**
 * The preference for which changes a user wants the Slack channel to be notified.
 */
enum class SlackUserPreferenceType(override val value: String?) : StringValue {

    /**
     * User preferences for collection change notifications.
     */
    COLLECTION_CHANGE("COLLECTION_CHANGE"),

    /**
     * User preferences for privacy change notifications.
     */
    PRIVACY_CHANGE("PRIVACY_CHANGE"),

    /**
     * User preferences for review page notifications.
     */
    REVIEW_PAGE("REVIEW_PAGE"),

    /**
     * User preferences for video detail notifications.
     */
    VIDEO_DETAIL("VIDEO_DETAIL"),

    /**
     * Unknown user preference.
     */
    UNKNOWN(null)
}
