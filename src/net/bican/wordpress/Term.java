/*
 * Wordpress-java https://github.com/canbican/wordpress-java/ Copyright 2012-2015 Can Bican
 * <can@bican.net> See the file 'COPYING' in the distribution for licensing terms.
 */
package net.bican.wordpress;

import net.bican.wordpress.util.StringHeader;

/**
 * Term object for a blog.
 *
 * @author Can Bican
 */
// @Builder
// @Data
// @EqualsAndHashCode(callSuper = false)
// @NoArgsConstructor
// @AllArgsConstructor
public class Term extends XmlRpcMapped implements StringHeader {
	Integer count;
	String description;
	String filter;
	String name;
	Integer parent;
	String slug;
	String taxonomy;
	String term_group;
	Integer term_id;
	String term_taxonomy_id;

	public Term() {
		super();
	}

	public Term(
			Integer count,
			String description,
			String filter,
			String name,
			Integer parent,
			String slug,
			String taxonomy,
			String term_group,
			Integer term_id,
			String term_taxonomy_id) {
		super();
		this.count = count;
		this.description = description;
		this.filter = filter;
		this.name = name;
		this.parent = parent;
		this.slug = slug;
		this.taxonomy = taxonomy;
		this.term_group = term_group;
		this.term_id = term_id;
		this.term_taxonomy_id = term_taxonomy_id;
	}

	@Override
	public String getStringHeader() {
		return ""; //$NON-NLS-1$
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(
			Integer count) {
		this.count = count;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(
			String description) {
		this.description = description;
	}

	public String getFilter() {
		return filter;
	}

	public void setFilter(
			String filter) {
		this.filter = filter;
	}

	public String getName() {
		return name;
	}

	public void setName(
			String name) {
		this.name = name;
	}

	public Integer getParent() {
		return parent;
	}

	public void setParent(
			Integer parent) {
		this.parent = parent;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(
			String slug) {
		this.slug = slug;
	}

	public String getTaxonomy() {
		return taxonomy;
	}

	public void setTaxonomy(
			String taxonomy) {
		this.taxonomy = taxonomy;
	}

	public String getTerm_group() {
		return term_group;
	}

	public void setTerm_group(
			String term_group) {
		this.term_group = term_group;
	}

	public Integer getTerm_id() {
		return term_id;
	}

	public void setTerm_id(
			Integer term_id) {
		this.term_id = term_id;
	}

	public String getTerm_taxonomy_id() {
		return term_taxonomy_id;
	}

	public void setTerm_taxonomy_id(
			String term_taxonomy_id) {
		this.term_taxonomy_id = term_taxonomy_id;
	}

}
