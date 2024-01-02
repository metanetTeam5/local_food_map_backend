package com.example.demo.notice.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.notice.model.Notice;



@Repository
@Mapper
public interface INoticeRepository {
	void			insertNotice(Notice notice);
	Long			selectMaxNoticeId();
	List<Notice>	selectAllNotice();
	Notice			selectNoticeById(Long notiId);
	int				updateNotice(Notice notice);
	int				updateNoticeViews(Notice notice);
	int				deleteNoticeById(Long notiId);
	
}
