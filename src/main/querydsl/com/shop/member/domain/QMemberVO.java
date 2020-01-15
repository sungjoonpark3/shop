//package com.shop.member.domain;
//
//import static com.querydsl.core.types.PathMetadataFactory.*;
//
//import com.querydsl.core.types.dsl.*;
//
//import com.querydsl.core.types.PathMetadata;
//import javax.annotation.Generated;
//import com.querydsl.core.types.Path;
//
//
///**
// * QMemberVO is a Querydsl query type for MemberVO
// */
//@Generated("com.querydsl.codegen.EntitySerializer")
//public class QMemberVO extends EntityPathBase<MemberVO> {
//
//    private static final long serialVersionUID = 1263475860L;
//
//    public static final QMemberVO memberVO = new QMemberVO("memberVO");
//
//    public final StringPath addressDetail = createString("addressDetail");
//
//    public final StringPath addressGnumberName = createString("addressGnumberName");
//
//    public final StringPath addressPostNumber = createString("addressPostNumber");
//
//    public final StringPath addressRoadName = createString("addressRoadName");
//
//    public final DateTimePath<java.util.Date> createDate = createDateTime("createDate", java.util.Date.class);
//
//    public final NumberPath<Long> seq = createNumber("seq", Long.class);
//
//    public final DateTimePath<java.util.Date> updateDate = createDateTime("updateDate", java.util.Date.class);
//
//    public final StringPath userDate = createString("userDate");
//
//    public final StringPath userEmail = createString("userEmail");
//
//    public final StringPath userGrade = createString("userGrade");
//
//    public final StringPath userId = createString("userId");
//
//    public final StringPath userName = createString("userName");
//
//    public final StringPath userPassword = createString("userPassword");
//
//    public final StringPath userPhone1 = createString("userPhone1");
//
//    public final StringPath userPhone2 = createString("userPhone2");
//
//    public final StringPath userPhone3 = createString("userPhone3");
//
//    public QMemberVO(String variable) {
//        super(MemberVO.class, forVariable(variable));
//    }
//
//    public QMemberVO(Path<? extends MemberVO> path) {
//        super(path.getType(), path.getMetadata());
//    }
//
//    public QMemberVO(PathMetadata metadata) {
//        super(MemberVO.class, metadata);
//    }
//
//}
//
