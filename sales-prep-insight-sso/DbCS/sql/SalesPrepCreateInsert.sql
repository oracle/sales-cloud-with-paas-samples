/* Copyright (c) 2015, Oracle and/or its affiliates. All rights reserved */
CREATE TABLE s4_service_requests
( sr_number          VARCHAR2(20) PRIMARY KEY,
  priority           NUMBER,
  product            VARCHAR2(20),
  create_date        DATE,
  last_updated       DATE,
  sr_owner           VARCHAR2(20),
  customer_contact   VARCHAR2(20) );

INSERT INTO s4_service_requests
VALUES
('3-124555667',
 2,
 'Weblogic',
 TO_DATE('2015/01/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'),
 TO_DATE('2015/02/08 11:03:24', 'yyyy/mm/dd hh24:mi:ss'),
 'John Doe',
 'Scott Doe'
);

INSERT INTO s4_service_requests
VALUES
('3-124552325',
 1,
 'Database',
 TO_DATE('2015/01/13 21:02:44', 'yyyy/mm/dd hh24:mi:ss'),
 TO_DATE('2015/01/15 11:03:24', 'yyyy/mm/dd hh24:mi:ss'),
 'Matt Davis',
 'Jeff Boss'
);

INSERT INTO s4_service_requests
VALUES
('3-123456789',
 2,
 'WebCenter Content',
 TO_DATE('2015/01/06 21:02:44', 'yyyy/mm/dd hh24:mi:ss'),
 TO_DATE('2015/01/08 11:03:24', 'yyyy/mm/dd hh24:mi:ss'),
 'John Jefferson',
 'Antonio Molina'
);

INSERT INTO s4_service_requests
VALUES
('3-124551234',
 2,
 'Documents Cloud',
 TO_DATE('2015/03/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'),
 TO_DATE('2015/03/28 11:03:24', 'yyyy/mm/dd hh24:mi:ss'),
 'Peter Doe',
 'Nick Johnson'
);

CREATE TABLE s4_news
( news_id            NUMBER PRIMARY KEY,
  title              VARCHAR2(200),
  body               VARCHAR2(1000) 
);

INSERT INTO s4_news
VALUES
(1001,
 'Court sides with Oracle over Android in Java patent appeal',
 'The long winding journey of the legal dispute between Google and Oracle over whether Androids use of Java components constitutes fair use has taken another twist as the federal appeals court on Friday overruled a lower court decision in favor of Google'
);

INSERT INTO s4_news
VALUES
(1002,
 'Fancy a game of PacMan Head to Google Maps',
 'Ever imagine what it would be like to play a monster game of PacMan through the streets of your hometown. Now you can as Google has built a fully playable game of PacMan into Google Maps.'
);

INSERT INTO s4_news
VALUES
(1003,
 'Millennials snapping up Snapchat study finds',
 'A whopping 71 percent of Snapchat US-based users are between the ages of 18 and 34. A new study from research firm ComScore shows. That easily topped Facebook and Twitter which are made up of 38 percent and 41 percent of users in that age group respectively. Popular Yahoo-owned microblogging service Tumblr was not so far behind with 53 percent of its users falling between the ages of 18 and 34.'
);

INSERT INTO s4_news
VALUES
(1004,
 'Mandatory Data Retention laws pass Australian Parliament',
 'Australian Internet Service Providers and telecommunications carriers will now be required to retain customer metadata for a minimum period of two years under new laws passed by the Australian Senate.'
);