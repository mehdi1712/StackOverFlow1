
package com.example.mehdi.stackoverflow.Pojos;

import java.util.List;

import com.google.gson.annotations.SerializedName;


public class Item {

    @SerializedName("accepted_answer_id")
    private Long mAcceptedAnswerId;
    @SerializedName("answer_count")
    private Long mAnswerCount;
    @SerializedName("creation_date")
    private Long mCreationDate;
    @SerializedName("is_answered")
    private Boolean mIsAnswered;
    @SerializedName("last_activity_date")
    private Long mLastActivityDate;
    @SerializedName("link")
    private String mLink;
    @SerializedName("owner")
    private Owner mOwner;
    @SerializedName("question_id")
    private Long mQuestionId;
    @SerializedName("score")
    private Long mScore;
    @SerializedName("tags")
    private List<String> mTags;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("view_count")
    private Long mViewCount;

    public Long getAcceptedAnswerId() {
        return mAcceptedAnswerId;
    }

    public void setAcceptedAnswerId(Long acceptedAnswerId) {
        mAcceptedAnswerId = acceptedAnswerId;
    }

    public Long getAnswerCount() {
        return mAnswerCount;
    }

    public void setAnswerCount(Long answerCount) {
        mAnswerCount = answerCount;
    }

    public Long getCreationDate() {
        return mCreationDate;
    }

    public void setCreationDate(Long creationDate) {
        mCreationDate = creationDate;
    }

    public Boolean getIsAnswered() {
        return mIsAnswered;
    }

    public void setIsAnswered(Boolean isAnswered) {
        mIsAnswered = isAnswered;
    }

    public Long getLastActivityDate() {
        return mLastActivityDate;
    }

    public void setLastActivityDate(Long lastActivityDate) {
        mLastActivityDate = lastActivityDate;
    }

    public String getLink() {
        return mLink;
    }

    public void setLink(String link) {
        mLink = link;
    }

    public Owner getOwner() {
        return mOwner;
    }

    public void setOwner(Owner owner) {
        mOwner = owner;
    }

    public Long getQuestionId() {
        return mQuestionId;
    }

    public void setQuestionId(Long questionId) {
        mQuestionId = questionId;
    }

    public Long getScore() {
        return mScore;
    }

    public void setScore(Long score) {
        mScore = score;
    }

    public List<String> getTags() {
        return mTags;
    }

    public void setTags(List<String> tags) {
        mTags = tags;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Long getViewCount() {
        return mViewCount;
    }

    public void setViewCount(Long viewCount) {
        mViewCount = viewCount;
    }

}
