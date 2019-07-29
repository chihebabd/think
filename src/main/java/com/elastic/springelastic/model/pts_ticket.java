package com.elastic.springelastic.model;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
@Document(indexName="pts",type="pts_ticket",shards=1)
public class pts_ticket {
	@Id
	private long ticket_id;
	private long state;
	private long responsible_id;
	private long editor_id;
	private long release_id;
	private long product_id;
	private long matrix_id;
	private long fl1,fl2,fl3;
	private String short_description,long_description,sloution_description;
	private String assignment;
	private String file_name_1,file_name_2,file_name_3,os_name,environment;
	private String server,ticket_database;
	private long priority,urgency;
	private String comment,ap_name,ap_tel,ap_bank;
	private long ap_id;
	private String company;
	private long responsible_pl,customer_id;
	private long cust_user_id,sent_back_id;
	private Date lock_date,mail_date,target_date;
	private String kunde_ref,service_level_info,remark,last_updated_field;
    private long production_release,test_release_id;
    private String country;
    private Date ts_insert,ts_update;
    private String email,editor,creator;
    private long type,plan_release_id;
    private float effort;
    private long progress,country_id,parent_ticket_id;
    private Date deadline;
    private float estimated_effort,amount_1,amount_2,amount_3,amount_4,amount_5;
	private String project;
	private String text_m_1,text_m_2,text_m_3;
	private String text_s_1,text_s_2,text_l_1,text_xl_1;
	private Date date_time_1,date_time_2,date_time_3;
	public long getTicket_id() {
		return ticket_id;
	}
	public void setTicket_id(long ticket_id) {
		this.ticket_id = ticket_id;
	}
	public long getState() {
		return state;
	}
	public void setState(long state) {
		this.state = state;
	}
	public long getResponsible_id() {
		return responsible_id;
	}
	public void setResponsible_id(long responsible_id) {
		this.responsible_id = responsible_id;
	}
	public long getEditor_id() {
		return editor_id;
	}
	public void setEditor_id(long editor_id) {
		this.editor_id = editor_id;
	}
	public long getRelease_id() {
		return release_id;
	}
	public void setRelease_id(long release_id) {
		this.release_id = release_id;
	}
	public long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(long product_id) {
		this.product_id = product_id;
	}
	public long getMatrix_id() {
		return matrix_id;
	}
	public void setMatrix_id(long matrix_id) {
		this.matrix_id = matrix_id;
	}
	public long getFl1() {
		return fl1;
	}
	public void setFl1(long fl1) {
		this.fl1 = fl1;
	}
	public long getFl2() {
		return fl2;
	}
	public void setFl2(long fl2) {
		this.fl2 = fl2;
	}
	public long getFl3() {
		return fl3;
	}
	public void setFl3(long fl3) {
		this.fl3 = fl3;
	}
	public String getShort_description() {
		return short_description;
	}
	public void setShort_description(String short_description) {
		this.short_description = short_description;
	}
	public String getLong_description() {
		return long_description;
	}
	public void setLong_description(String long_description) {
		this.long_description = long_description;
	}
	public String getSloution_description() {
		return sloution_description;
	}
	public void setSloution_description(String sloution_description) {
		this.sloution_description = sloution_description;
	}
	public String getAssignment() {
		return assignment;
	}
	public void setAssignment(String assignment) {
		this.assignment = assignment;
	}
	public String getFile_name_1() {
		return file_name_1;
	}
	public void setFile_name_1(String file_name_1) {
		this.file_name_1 = file_name_1;
	}
	public String getFile_name_2() {
		return file_name_2;
	}
	public void setFile_name_2(String file_name_2) {
		this.file_name_2 = file_name_2;
	}
	public String getFile_name_3() {
		return file_name_3;
	}
	public void setFile_name_3(String file_name_3) {
		this.file_name_3 = file_name_3;
	}
	public String getOs_name() {
		return os_name;
	}
	public void setOs_name(String os_name) {
		this.os_name = os_name;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public String getServer() {
		return server;
	}
	public void setServer(String server) {
		this.server = server;
	}
	public String getTicket_database() {
		return ticket_database;
	}
	public void setTicket_database(String ticket_database) {
		this.ticket_database = ticket_database;
	}
	public long getPriority() {
		return priority;
	}
	public void setPriority(long priority) {
		this.priority = priority;
	}
	public long getUrgency() {
		return urgency;
	}
	public void setUrgency(long urgency) {
		this.urgency = urgency;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getAp_name() {
		return ap_name;
	}
	public void setAp_name(String ap_name) {
		this.ap_name = ap_name;
	}
	public String getAp_tel() {
		return ap_tel;
	}
	public void setAp_tel(String ap_tel) {
		this.ap_tel = ap_tel;
	}
	public String getAp_bank() {
		return ap_bank;
	}
	public void setAp_bank(String ap_bank) {
		this.ap_bank = ap_bank;
	}
	public long getAp_id() {
		return ap_id;
	}
	public void setAp_id(long ap_id) {
		this.ap_id = ap_id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public long getResponsible_pl() {
		return responsible_pl;
	}
	public void setResponsible_pl(long responsible_pl) {
		this.responsible_pl = responsible_pl;
	}
	public long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}
	public long getCust_user_id() {
		return cust_user_id;
	}
	public void setCust_user_id(long cust_user_id) {
		this.cust_user_id = cust_user_id;
	}
	public long getSent_back_id() {
		return sent_back_id;
	}
	public void setSent_back_id(long sent_back_id) {
		this.sent_back_id = sent_back_id;
	}
	public Date getLock_date() {
		return lock_date;
	}
	public void setLock_date(Date lock_date) {
		this.lock_date = lock_date;
	}
	public Date getMail_date() {
		return mail_date;
	}
	public void setMail_date(Date mail_date) {
		this.mail_date = mail_date;
	}
	public Date getTarget_date() {
		return target_date;
	}
	public void setTarget_date(Date target_date) {
		this.target_date = target_date;
	}
	public String getKunde_ref() {
		return kunde_ref;
	}
	public void setKunde_ref(String kunde_ref) {
		this.kunde_ref = kunde_ref;
	}
	public String getService_level_info() {
		return service_level_info;
	}
	public void setService_level_info(String service_level_info) {
		this.service_level_info = service_level_info;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getLast_updated_field() {
		return last_updated_field;
	}
	public void setLast_updated_field(String last_updated_field) {
		this.last_updated_field = last_updated_field;
	}
	public long getProduction_release() {
		return production_release;
	}
	public void setProduction_release(long production_release) {
		this.production_release = production_release;
	}
	public long getTest_release_id() {
		return test_release_id;
	}
	public void setTest_release_id(long test_release_id) {
		this.test_release_id = test_release_id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Date getTs_insert() {
		return ts_insert;
	}
	public void setTs_insert(Date ts_insert) {
		this.ts_insert = ts_insert;
	}
	public Date getTs_update() {
		return ts_update;
	}
	public void setTs_update(Date ts_update) {
		this.ts_update = ts_update;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public long getType() {
		return type;
	}
	public void setType(long type) {
		this.type = type;
	}
	public long getPlan_release_id() {
		return plan_release_id;
	}
	public void setPlan_release_id(long plan_release_id) {
		this.plan_release_id = plan_release_id;
	}
	public float getEffort() {
		return effort;
	}
	public void setEffort(float effort) {
		this.effort = effort;
	}
	public long getProgress() {
		return progress;
	}
	public void setProgress(long progress) {
		this.progress = progress;
	}
	public long getCountry_id() {
		return country_id;
	}
	public void setCountry_id(long country_id) {
		this.country_id = country_id;
	}
	public long getParent_ticket_id() {
		return parent_ticket_id;
	}
	public void setParent_ticket_id(long parent_ticket_id) {
		this.parent_ticket_id = parent_ticket_id;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	public float getEstimated_effort() {
		return estimated_effort;
	}
	public void setEstimated_effort(float estimated_effort) {
		this.estimated_effort = estimated_effort;
	}
	public float getAmount_1() {
		return amount_1;
	}
	public void setAmount_1(float amount_1) {
		this.amount_1 = amount_1;
	}
	public float getAmount_2() {
		return amount_2;
	}
	public void setAmount_2(float amount_2) {
		this.amount_2 = amount_2;
	}
	public float getAmount_3() {
		return amount_3;
	}
	public void setAmount_3(float amount_3) {
		this.amount_3 = amount_3;
	}
	public float getAmount_4() {
		return amount_4;
	}
	public void setAmount_4(float amount_4) {
		this.amount_4 = amount_4;
	}
	public float getAmount_5() {
		return amount_5;
	}
	public void setAmount_5(float amount_5) {
		this.amount_5 = amount_5;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getText_m_1() {
		return text_m_1;
	}
	public void setText_m_1(String text_m_1) {
		this.text_m_1 = text_m_1;
	}
	public String getText_m_2() {
		return text_m_2;
	}
	public void setText_m_2(String text_m_2) {
		this.text_m_2 = text_m_2;
	}
	public String getText_m_3() {
		return text_m_3;
	}
	public void setText_m_3(String text_m_3) {
		this.text_m_3 = text_m_3;
	}
	public String getText_s_1() {
		return text_s_1;
	}
	public void setText_s_1(String text_s_1) {
		this.text_s_1 = text_s_1;
	}
	public String getText_s_2() {
		return text_s_2;
	}
	public void setText_s_2(String text_s_2) {
		this.text_s_2 = text_s_2;
	}
	public String getText_l_1() {
		return text_l_1;
	}
	public void setText_l_1(String text_l_1) {
		this.text_l_1 = text_l_1;
	}
	public String getText_xl_1() {
		return text_xl_1;
	}
	public void setText_xl_1(String text_xl_1) {
		this.text_xl_1 = text_xl_1;
	}
	public Date getDate_time_1() {
		return date_time_1;
	}
	public void setDate_time_1(Date date_time_1) {
		this.date_time_1 = date_time_1;
	}
	public Date getDate_time_2() {
		return date_time_2;
	}
	public void setDate_time_2(Date date_time_2) {
		this.date_time_2 = date_time_2;
	}
	public Date getDate_time_3() {
		return date_time_3;
	}
	public void setDate_time_3(Date date_time_3) {
		this.date_time_3 = date_time_3;
	}
	
	
	
	

}
