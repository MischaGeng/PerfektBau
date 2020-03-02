package com.perfect.project.ssm.service;

import com.perfect.project.ssm.entity.Classmate;

import java.util.List;

/*
 *
 * @Description 班级服务接口
 *
 * @author w15104
 * @data: 2019-3-5
 *
 * @modified by:
 * @modified date:
 * @modified no:
 */
public interface IClassmateService {

    List<Classmate> findClassByID(String id);

}
