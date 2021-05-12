package com.Annotation.CoreQuestion5.repository;

public interface ObjectRepository<T> {

	public void store(T t);

	public  T retrieve(int studentId);

	public T search(String studentame);

	public T delete(int studentId);
}
