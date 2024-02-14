package com.example.board.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.board.entity.Post;

/**
 * 投稿のリポジトリー.
 */
public interface PostRepository extends JpaRepository<Post, String> {
	/**
	* IDで検索する
	*
	* @param id ID
	* @return 投稿
	*/
	public Optional<Post> findById(String id);

	/**
	* 更新日時の降順ですべての投稿を検索する
	*
	* @return 投稿のリスト
	*/
//	List<Post> findAllByOrderByUpdatedDateDesc();
	List<Post> findByDeletedFalseOrderByUpdatedDateDesc();
}