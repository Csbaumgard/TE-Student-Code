------------------------------------
---------------TABLES---------------
------------------------------------

	-----Member Table-----
CREATE TABLE member
		(
		member_id int UNIQUE NOT NULL,
		last_name varchar(50) NOT NULL,
		first_name varchar(50) NOT NULL,
		email varchar(50) UNIQUE NOT NULL,
		phone varchar(15) UNIQUE,
		date_of_birth date NOT NULL,
		wants_emails boolean NOT NULL
		);
ALTER TABLE member
		ADD CONSTRAINT pk_member PRIMARY KEY (member_id);
	
	-----Event Table-----
CREATE TABLE event
		(
		event_id int NOT NULL,
		name varchar(100) NOT NULL,
		description varchar(999),
		start_date_time timestamp NOT NULL,
		duration int,
		organizer varchar(50) NOT NULL
		);
ALTER TABLE event
		ADD CONSTRAINT pk_event PRIMARY KEY (event_id),
		ADD CONSTRAINT chk_duration CHECK (duration >= 0);
	
	-----Interest Group Table-----
CREATE TABLE interest_group
		(
		group_id int UNIQUE NOT NULL,
		name varchar(50) UNIQUE NOT NULL
		);
ALTER TABLE interest_group
		ADD CONSTRAINT pk_interest_group PRIMARY KEY (group_id);
		
	-----Group Member-----
CREATE TABLE group_member
		(
		group_id int REFERENCES interest_group (group_id),
		member_id int REFERENCES member (member_id)
		);
ALTER TABLE group_member
		ADD CONSTRAINT pk_group_member PRIMARY KEY (group_id, member_id);
		
	-----Event Member-----
CREATE TABLE event_member
		(
		event_id int REFERENCES event (event_id),
 		member_id int REFERENCES member (member_id)
		);
ALTER TABLE event_member
		ADD CONSTRAINT pk_event_member PRIMARY KEY (event_id, member_id);

-------------------------------------
---------------INSERTS---------------
-------------------------------------

	-----Members-----
INSERT INTO member (member_id, last_name, first_name, email, phone, date_of_birth, wants_emails)
VALUES  (1001, 'Baumgard', 'Colton', 'cbaumgard@gmail.com', '7246942069', '7/3/1997', false),
		(1002, 'Majernik', 'Lylah', 'lmajernik@gmail.com', '7242222010', '5/21/1998', true),
		(1003, 'Majernik', 'Twinkle', 'twink@gmail.com', '7248881188', '7/3/2020', true),
		(1004, 'Thecat', 'Deacon', 'catfishing@gmail.com', '7242222222', '1/1/2020', false),
		(1005, 'Thedragon', 'Jeff', 'dragons@gmail.com', '4129992626', '12/15/2008', false),
		(1006, 'Sullivan', 'Suzie', 'ssullivan@gmail.com', '7246200053', '7/15/1974', true),
		(1007, 'Baumgard', 'Tyler', 'tbaumgard@gmail.com', '7249579689', '5/24/2002', false),
		(1008, 'Majernik', 'Steve', 'smajernik@gmail.com', '7247247247', '7/7/1977', true);
		
	-----Groups-----
INSERT INTO interest_group (group_id, name)
VALUES (101, 'Fishing');
INSERT INTO interest_group (group_id, name)
VALUES (102, 'Pets');
INSERT INTO interest_group (group_id, name)
VALUES (103, 'Gamers');
INSERT INTO interest_group (group_id, name)
VALUES (104, 'Dads&Dragons');

	-----Events-----
INSERT INTO event (event_id, name, description, start_date_time, duration, organizer)
VALUES (111, 'Fishing Fans', 'Fans of fishing unite!', '2022-07-03T14:00:00', 120, 'Fishing');
INSERT INTO event (event_id, name, description, start_date_time, duration, organizer)
VALUES (222, 'Pets Union Meeting', 'Pets discuss fair compensation.', '2022-05-21T15:00:00', 180, 'Pets');
INSERT INTO event (event_id, name, description, start_date_time, duration, organizer)
VALUES (333, 'Gamers LAN Party', 'Come play games', '2022-07-15T12:00:00', 240, 'Gamers');
INSERT INTO event (event_id, name, description, start_date_time, duration, organizer)
VALUES (444, 'Dads&Dragons Meetup', 'There are dads and dragons here.', '2022-12-12T14:00:00', 300, 'Dads&Dragons');

	-----Putting Together-----
INSERT INTO group_member (group_id, member_id)
VALUES ((SELECT group_id FROM interest_group WHERE name = 'Fishing'), (SELECT member_id FROM member WHERE first_name = 'Tyler')),
	   ((SELECT group_id FROM interest_group WHERE name = 'Fishing'), (SELECT member_id FROM member WHERE first_name = 'Suzie')),
	   ((SELECT group_id FROM interest_group WHERE name = 'Pets'), (SELECT member_id FROM member WHERE first_name = 'Twinkle')),
	   ((SELECT group_id FROM interest_group WHERE name = 'Pets'), (SELECT member_id FROM member WHERE first_name = 'Deacon')),
	   ((SELECT group_id FROM interest_group WHERE name = 'Gamers'), (SELECT member_id FROM member WHERE first_name = 'Colton')),
	   ((SELECT group_id FROM interest_group WHERE name = 'Gamers'), (SELECT member_id FROM member WHERE first_name = 'Lylah')),
	   ((SELECT group_id FROM interest_group WHERE name = 'Dads&Dragons'), (SELECT member_id FROM member WHERE first_name = 'Jeff')),
	   ((SELECT group_id FROM interest_group WHERE name = 'Dads&Dragons'), (SELECT member_id FROM member WHERE first_name = 'Steve'));

INSERT INTO event_member (event_id, member_id)
VALUES ((SELECT event_id FROM event WHERE name = 'Fishing Fans'), (SELECT member_id FROM member WHERE first_name = 'Tyler')),
	   ((SELECT event_id FROM event WHERE name = 'Fishing Fans'), (SELECT member_id FROM member WHERE first_name = 'Suzie')),
	   ((SELECT event_id FROM event WHERE name = 'Pets Union Meeting'), (SELECT member_id FROM member WHERE first_name = 'Twinkle')),
	   ((SELECT event_id FROM event WHERE name = 'Pets Union Meeting'), (SELECT member_id FROM member WHERE first_name = 'Deacon')),
	   ((SELECT event_id FROM event WHERE name = 'Gamers LAN Party'), (SELECT member_id FROM member WHERE first_name = 'Colton')),
	   ((SELECT event_id FROM event WHERE name = 'Gamers LAN Party'), (SELECT member_id FROM member WHERE first_name = 'Lylah')),
	   ((SELECT event_id FROM event WHERE name = 'Dads&Dragons Meetup'), (SELECT member_id FROM member WHERE first_name = 'Jeff')),
	   ((SELECT event_id FROM event WHERE name = 'Dads&Dragons Meetup'), (SELECT member_id FROM member WHERE first_name = 'Steve'));
	   
	-----Testing-----
/*
SELECT *
FROM member
JOIN group_member USING (member_id)
JOIN interest_group USING (group_id)
JOIN event_member USING (member_id)
JOIN event USING (event_id)
ORDER BY last_name;

DROP TABLE member, event, interest_group, group_member, event_member;
*/


