package org.agoncal.quarkus.starting;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Book
{
	private int id;
	private String title;
	private String author;
	private int yearOfPublication;
	private String genre;
}
