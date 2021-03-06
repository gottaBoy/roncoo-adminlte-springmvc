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
package com.roncoo.adminlte.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.roncoo.adminlte.bean.entity.RcDataDictionaryList;
import com.roncoo.adminlte.bean.entity.RcEmailAccountInfo;
import com.roncoo.adminlte.service.DataDictionaryListService;
import com.roncoo.adminlte.service.EmailAccountInfoService;
import com.roncoo.adminlte.util.base.Page;

/**
 * 邮件账号逻辑功能
 * 
 * @author LYQ
 */
@Component
public class EmailAccountInfoBiz {

	@Autowired
	private EmailAccountInfoService emailAccountInfoService;

	@Autowired
	private DataDictionaryListService dictionaryListService;

	/**
	 * 分页查询
	 * 
	 * @param pageCurrent
	 * @param pageSize
	 * @return
	 */
	public Page<RcEmailAccountInfo> listForPage(int pageCurrent, int pageSize) {
		return emailAccountInfoService.listForPage(pageCurrent, pageSize);
	}

	/**
	 * 添加
	 * 
	 * @param rcEmailAccountInfo
	 */
	public void save(RcEmailAccountInfo info) {
		emailAccountInfoService.save(info);
	}

	/**
	 * 根据id删除
	 * 
	 * @param id
	 */
	public void deleteById(Long id) {
		emailAccountInfoService.deleteById(id);
	}

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	public RcEmailAccountInfo queryById(Long id) {
		return emailAccountInfoService.queryById(id);
	}

	/**
	 * 更新
	 * 
	 * @param info
	 */
	public void update(RcEmailAccountInfo info) {
		emailAccountInfoService.update(info);
	}

	/**
	 * 获取下拉选项
	 * 
	 * @param fieldCode
	 * @return
	 */
	public List<RcDataDictionaryList> listByFieldCode(String fieldCode) {
		return dictionaryListService.listByFieldCode(fieldCode);
	}

}
