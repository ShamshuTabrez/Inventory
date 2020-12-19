insert into hsncode(id,code) values(1,'HSN000_1');
insert into hsncode(id,code) values(2,'HSN000_2');
insert into hsncode(id,code) values(3,'HSN000_3');
insert into hsncode(id,code) values(4,'HSN000_4');
insert into hsncode(id,code) values(5,'HSN000_5');
insert into hsncode(id,code) values(6,'HSN000_6');
insert into item(id,name,hsn_id) values(1,'Laptop', 1);
insert into item(id,name,hsn_id) values(2,'SmartPhone', 2);
insert into item(id,name,hsn_id) values(3,'Earphone', 3);
insert into item(id,name,hsn_id) values(4,'Speaker', 4);
insert into item(id,name,hsn_id) values(5,'TShirt', 5);
insert into item(id,name,hsn_id) values(6,'Trousers', 6);
insert into cost(id,rate,item_id) values(1,50000,1);
insert into cost(id,rate,item_id) values(2,20000,2);
insert into cost(id,rate,item_id) values(3,2000,3);
insert into cost(id,rate,item_id) values(4,5000,4);
insert into cost(id,rate,item_id) values(5,500,5);
insert into cost(id,rate,item_id) values(6,1000,6);
insert into cost_centre(id,organization,name) values(1,'ACER','Laptop');
insert into cost_centre(id,organization,name) values(2,'iPhone','SmartPhone');
insert into cost_centre(id,organization,name) values(3,'BOAT','Earphone');
insert into cost_centre(id,organization,name) values(4,'JBL','Speaker');
insert into cost_centre(id,organization,name) values(5,'NIKE','TShirt');
insert into cost_centre(id,organization,name) values(6,'NIKE','Trousers');
insert into stock(id,closing_stock,opening_stock,costcentre_id,item_id) values(1,100,500,1,1);
insert into stock(id,closing_stock,opening_stock,costcentre_id,item_id) values(2,200,1000,2,2);
insert into stock(id,closing_stock,opening_stock,costcentre_id,item_id) values(3,250,7000,3,3);
insert into stock(id,closing_stock,opening_stock,costcentre_id,item_id) values(4,200,6000,4,4);
insert into stock(id,closing_stock,opening_stock,costcentre_id,item_id) values(5,200,1000,5,5);
insert into stock(id,closing_stock,opening_stock,costcentre_id,item_id) values(6,200,1000,6,6);