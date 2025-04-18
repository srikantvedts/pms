package com.vts.pfms.project.dto;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProjectSlideDto {

	private Long SlideId;
	private Long ProjectId;
	private String Status;
	private String Brief;
	private String Slide;
	private String WayForward;
	private MultipartFile ImageAttach;
	private MultipartFile PdfAttach;
	private MultipartFile Video;
	private String labcode;
	private int IsActive;
	private String CreatedBy;
	private String CreatedDate;
	private String ModifiedBy;
	private String ModifiedDate;
}
