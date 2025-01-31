package com.ssafy.ploud.domain.user;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUserEntity is a Querydsl query type for UserEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUserEntity extends EntityPathBase<UserEntity> {

    private static final long serialVersionUID = 1100728538L;

    public static final QUserEntity userEntity = new QUserEntity("userEntity");

    public final ComparablePath<java.time.Year> birthYear = createComparable("birthYear", java.time.Year.class);

    public final NumberPath<Integer> complainCount = createNumber("complainCount", Integer.class);

    public final StringPath email = createString("email");

    public final DateTimePath<java.time.LocalDateTime> joinDate = createDateTime("joinDate", java.time.LocalDateTime.class);

    public final StringPath name = createString("name");

    public final StringPath nickname = createString("nickname");

    public final StringPath password = createString("password");

    public final StringPath profileImg = createString("profileImg");

    public final StringPath refreshToken = createString("refreshToken");

    public final DateTimePath<java.time.LocalDateTime> restrictDate = createDateTime("restrictDate", java.time.LocalDateTime.class);

    public final EnumPath<Role> role = createEnum("role", Role.class);

    public final NumberPath<Long> soloDurationInMinute = createNumber("soloDurationInMinute", Long.class);

    public final ListPath<com.ssafy.ploud.domain.speech.SpeechEntity, com.ssafy.ploud.domain.speech.QSpeechEntity> speechEntityList = this.<com.ssafy.ploud.domain.speech.SpeechEntity, com.ssafy.ploud.domain.speech.QSpeechEntity>createList("speechEntityList", com.ssafy.ploud.domain.speech.SpeechEntity.class, com.ssafy.ploud.domain.speech.QSpeechEntity.class, PathInits.DIRECT2);

    public final NumberPath<Long> studyDurationInMinute = createNumber("studyDurationInMinute", Long.class);

    public final StringPath userId = createString("userId");

    public QUserEntity(String variable) {
        super(UserEntity.class, forVariable(variable));
    }

    public QUserEntity(Path<? extends UserEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserEntity(PathMetadata metadata) {
        super(UserEntity.class, metadata);
    }

}

