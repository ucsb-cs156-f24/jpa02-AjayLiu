package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

	Team team;

	@BeforeEach
	public void setup() {
		team = new Team("test-team");
	}

	@Test
	public void getName_returns_correct_name() {
		assert (team.getName().equals("test-team"));
	}

	@Test
	public void toString_returns_correct_string() {
		assertEquals("Team(name=test-team, members=[])", team.toString());
	}

	@Test
	public void equals_returns_true_for_same_content() {
		Team t1 = new Team();
		t1.setName("foo");
		t1.addMember("bar");
		Team t2 = new Team();
		t2.setName("foo");
		t2.addMember("bar");
		assertEquals(t1, t2);
	}

	@Test
	public void equals_returns_false_for_different_content() {
		Team t1 = new Team();
		t1.setName("foo");
		t1.addMember("bar");
		Team t2 = new Team();
		t2.setName("foo");
		t2.addMember("baz");
		assertEquals(false, t1.equals(t2));
	}

	@Test
	public void equals_returns_false_for_different_type() {
		Team t1 = new Team();
		t1.setName("foo");
		t1.addMember("bar");
		assertEquals(false, t1.equals("foo"));
	}

	@Test
	public void equals_returns_true_for_same_object() {
		Team t1 = new Team();
		t1.setName("foo");
		t1.addMember("bar");
		assertEquals(t1, t1);
	}

	@Test
	public void equals_returns_false_for_same_name_different_members() {
		Team t1 = new Team();
		t1.setName("foo");
		t1.addMember("bar");
		Team t2 = new Team();
		t2.setName("foo");
		t2.addMember("baz");
		assertEquals(false, t1.equals(t2));
	}

	@Test
	public void equals_returns_false_for_same_members_different_name() {
		Team t1 = new Team();
		t1.setName("foo");
		t1.addMember("bar");
		Team t2 = new Team();
		t2.setName("baz");
		t2.addMember("bar");
		assertEquals(false, t1.equals(t2));
	}

	@Test
	void hashCode_same_for_same_content() {
		Team t1 = new Team();
		t1.setName("foo");
		t1.addMember("bar");
		Team t2 = new Team();
		t2.setName("foo");
		t2.addMember("bar");
		assertEquals(t1.hashCode(), t2.hashCode());
	}

	@Test
	public void hashCode_returns_correct_hashcode() {
		// instantiate t as a Team object
		Team t = new Team("test-team");
		int result = t.hashCode();
		int expectedResult = -1226298695;
		assertEquals(expectedResult, result);
	}

}
