/*
 * Copyright 2015-2016 RonCoo(http://www.roncoo.com) Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.roncoo.adminlte.service;

import com.roncoo.adminlte.bean.entity.RcEmailAccountInfo;
import com.roncoo.adminlte.util.base.Page;

/**
 * 邮件账号服务功能
 * 
 * @author LYQ
 */
public interface EmailAccountInfoService {

	/**
	 * 分页查询
	 * 
	 * @param page
	 * @param example
	 * @return
	 */
	Page<RcEmailAccountInfo> listForPage(int pageCurrent, int pageSize);

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	RcEmailAccountInfo queryById(Long id);

	/**
	 * 添加
	 * 
	 * @param info
	 */
	int save(RcEmailAccountInfo info);

	/**
	 * 更新
	 * 
	 * @param info
	 */
	int updateById(RcEmailAccountInfo info);

	/**
	 * 根据id删除
	 * 
	 * @param id
	 */
	int deleteById(Long id);

	/**
	 * 随机获取一条记录
	 * 
	 * @return
	 */
	RcEmailAccountInfo queryByRand();

	/**
	 * 更新
	 * 
	 * @param info
	 * @return
	 */
	int update(RcEmailAccountInfo info);
}
