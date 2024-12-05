create table FoodService (
	place_no int auto_increment primary key,
    category varchar(30) NOT NULL,
    name varchar(200) not null,
    location varchar(200) not null,
    bestmenu varchar(100),
    rating decimal(3, 2),
    phone varchar(30),
    opentime varchar(100)
);

insert into FoodService (category, name, location, bestmenu, rating, phone, opentime)
values ('일식', '지즈', '부산 부산진구 서전로58번길 34-1 1층', '히레카츠', 4.8, '0507-1485-1331', '11:30');

insert into FoodService (category, name, location, bestmenu, rating, phone, opentime)
values ('일식', '칸다소바 부전동점', '부산 부산진구 동천로 105 1층 칸다소바', '마제소바', 4.53, '0507-1366-1662', '11:30');

insert into FoodService (category, name, location, bestmenu, rating, phone, opentime)
values ('양식', '프리윌피자 전포', '부산 부산진구 전포대로224번길 26 1층 프리윌피자', '프리윌피자', 4.8, '0507-1319-0985', '11:00');

insert into FoodService (category, name, locatiofoodservicen, bestmenu, rating, phone, opentime)
values ('일식', '소연옥 전포동본점', '부산 부산진구 동성로39번길 32 1층 소연옥 부산전포점', '규카츠', 4.59, '0507-1419-1367', '11:30');

insert into FoodService (category, name, location, bestmenu, rating, phone, opentime)
values ('양식', '치킨버거클럽', '부산 부산진구 서전로58번길 121 1층', '더티화이트', 4.65, '0507-1377-4744', '11:40');

insert into FoodService (category, name, location, bestmenu, rating, phone, opentime)
values ('한식', '전포밥집', '부산 부산진구 전포대로186번길 28 1층 전포밥집', '계란말이', 4.5, '0507-1413-2332', '11:00');

insert into FoodService (category, name, location, bestmenu, rating, phone, opentime)
values ('커피', '히떼 로스터리', '부산 부산진구 동성로 59 2층', '필터커피', 4.89, '070-7607-7060', '10:00');

insert into FoodService (category, name, location, bestmenu, rating, phone, opentime)
values ('커피', '프루토 프루타', '부산 부산진구 전포대로224번길 28 1층', '아사이볼', 4.62, '0507-1385-9862', '12:00');

insert into FoodService (category, name, location, bestmenu, rating, phone, opentime)
values ('커피', '베르크로스터스', '부산 부산진구 서전로58번길 115 지상1층, 2층', '필터커피', 4.6, '051-817-2111', '10:00');

insert into FoodService (category, name, location, bestmenu, rating, phone, opentime)
values ('한식', '수변최고돼지국밥 민락본점', '부산 수영구 광안해변로370번길 9-32', '필터커피', 4.5, '0507-1333-9222', '24:00');

insert into FoodService (category, name, location, bestmenu, rating, phone, opentime)
values ('일식', '톤쇼우 광안점', '부산 수영구 광안해변로279번길 13 1층', '버크셔K 로스카츠', 4.55, '010-5835-7978', '11:00');

insert into FoodService (category, name, location, bestmenu, rating, phone, opentime)
values ('한식', '초필살돼지구이 광안직영점', '부산 수영구 광남로108번길 9 1층 초필살돼지구이 광안직영점', '필살껍데기', 4.5, '051-757-5515', '17:00');

insert into FoodService (category, name, location, bestmenu, rating, phone, opentime)
values ('미쉐린', '융캉찌에', '부산 수영구 광안해변로277번길 10 1층', '우육탕면', 4.6, '0507-1441-6011', '11:00');

insert into FoodService (category, name, location, bestmenu, rating, phone, opentime)
values ('미쉐린', '나가하마만게츠', '부산 해운대구 우동1로 57 대영빌딩1층', '나가하마라멘', 4.66, '051-731-0886', '11:00');

insert into FoodService (category, name, location, bestmenu, rating, phone, opentime)
values ('일식', '중화소바 지평', '부산 사상구 사상로 172 A동 1층', '돈코츠 백탕', 4.8, '0507-1320-9351', '11:00');

insert into FoodService (category, name, location, bestmenu, rating, phone, opentime)
values ('한식', '합천일류돼지국밥', '부산 사상구 광장로 34 윌로펌프', '돼지국밥', 4.42, '051-317-2478', '24:00');

insert into FoodService (category, name, location, bestmenu, rating, phone, opentime)
values ('커피', '쉽커피 사상점', '부산 사상구 사상로 182 1층 쉽커피', '은하수빵', 4.58, '070-7543-6598', '08:00');

select * from foodservice;
