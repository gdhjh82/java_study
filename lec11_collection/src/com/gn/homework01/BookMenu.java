package com.gn.homework01;

import java.util.List;
import java.util.Scanner;

public class BookMenu {
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	
	public void mainMenu() {
		int menu = 0;
		do{			
			System.out.println("===가남 도서관에 오신걸 환영합니다===");
			System.out.println("원하시는 업무의 번호를 선택하세요.");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택 : ");
			menu = sc.nextInt();
			switch(menu) {
			case 1 : insertBook();
			break;
			case 2 : selectList();
			break;
			case 3 : searchBook();
			break;
			case 4 : deleteBook();
			break;
			case 5 : ascBook();
			break;
			case 9 :
				System.out.println("프로그램을 종료합니다.");
				break;
			default : 
				System.out.println("잘못된 명령입니다. 다시 입력해주세요");
			}
		}while(menu!=9);
		
	}
	public void insertBook() {
		System.out.print("도서명 :");
		String title = sc.next();
		System.out.print("저자명 :" );
		String author = sc.next();
		System.out.print("장르 :");
		String category = sc.next();
		System.out.print("가격 :");
		int price = sc.nextInt();
		Book newbook = new Book(title, author, category, price);
		bc.insertBook(newbook);
		System.out.println("도서가 추가되었습니다.");
	}
	
	public void selectList() {
		List<Book> bookList = bc.selectList();
		if(bookList.isEmpty()) {
			System.out.println("저장된 도서가 없습니다.");
		}else {
			System.out.println("===도서 목록===");
			for(Book book : bookList) {
				System.out.println(book.toString());
			}
		}
		
		
	}
	public void searchBook() {
		System.out.print("검색어 :");
		String keyword = sc.nextLine();
		List<Book>searchList = bc.searchBook(keyword);
		if(searchList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		}else {
			for(Book book : searchList) {
				System.out.println(book.toString());
			}
		}
				
	}
	public void deleteBook() {
		System.out.println("도서명 :");
		String title = sc.nextLine();
		System.out.println("저자명 :");
		String author = sc.nextLine();
		Book remove= bc.deleteBook(title,author);
		if(rem) {
			System.out.println();
		}else {
			System.out.println();
		}
	}
	public void ascBook() {
		System.out.println();
	}
}
