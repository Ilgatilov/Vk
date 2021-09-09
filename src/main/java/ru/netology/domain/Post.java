package ru.netology.domain;

public class Post {
    private int recordId;
    private int ownerId;
    private CommentsInfo commentsInfo;
    private LikesInfo likesInfo;
    private ViewsInfo viewsInfo;
    private RepostInfo repostInfo;
    private GeolocationInfo geolocationInfo;
    private int date;
    private int communityId;
    private int time;
    private int PhotoCommunityId;
    private boolean InBookmark;
    private int haveTimer;
    private int pinPost;
    private int deletePost;
    private int editPost;
    private String postText;
    private int advertisingInfo;
    // версия 2.0
    private CopyrightInfo copyrightInfo;
    private PostSource postSource;
    private DonutInfo donutInfo;
    // добавлено
    private int createdBy;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
}
