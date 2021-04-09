package edu.kh.poly.practice.model.service;
import edu.kh.poly.practice.model.vo.Person;
public interface QuestionInterface {

// �޴� ���
public abstract void displayMenu();
// 1. Person �迭 pArr�� �л� �Ǵ� ���� ����ϱ�.
// -> ���� 1�� �Է� ������ �л� ��ü�� ������ �迭��ҿ� ����
// -> ���� 2�� �Է� ������ ���� ��ü�� ������ �迭 ��ҿ� ����
public abstract void insertPerson();

// 2.pArr �迭�� ����Ǿ��ִ� ��� ��� ����ϱ�.
// �迭��ҿ� ���� �Էµ��� ���� ��� "�迭��ҿ� ����� ������
//�����ϴ�."
public abstract void selectAll();
// 3. pArr�迭���� �л� ������ ����ϱ�
public abstract void selectStudent();
// 4. pArr�迭���� ���� ������ ����ϱ�
public abstract void selectEmployee();
// 5. pArr�迭���� �Է� ���� �̸��� ���� ��� ������ ���� ����ϱ�
public abstract Person searchName();

// 6. ��� ����� �̸��� �� �ٷε� ���ڿ��� ���� ����ϱ�
// ex)
// ȫ�浿, �ڿ���, ��ö��
public abstract String printName();

// 7. ��� ����� ���� �հ�, �ְ�/���� ���� ����ϱ�

// ex)
// ��� ����� ���� �� : 100
// �ְ� ���� : 50
// ���� ���� : 20
public abstract void printAge();

// 8. Ư�� �ε����� �ִ� ����� ������ �����ϰ�,
// ������ ��� ������ ���� ����ϱ�
// ex)
// ������ �ε��� : 0
// 0�� �ε����� �ִ� ȫ�浿 / 20 / 3 / 5 ������ �����Ǿ����ϴ�.
public abstract Person deletePerson();

// 9. �迭 ũ�⸦ 1ĭ �ø���, �þ ĭ�� ���ο� �л� �Ǵ� ����
//����ϱ�
public abstract void addPerson();

}