# --- Create items tables and a foreign key.

# --- !Ups

 CREATE TABLE item (
   id             BIGINT NOT NULL AUTO_INCREMENT,
   name           varchar(255) DEFAULT NULL,
   price          DECIMAL(19,2) DEFAULT NULL,
   quantity       BIGINT,
   item_condition      varchar(255),
   color          varchar(255),
   category_id    BIGINT NOT NULL,

   PRIMARY KEY (id),
   FOREIGN KEY ( category_id ) REFERENCES category ( id )
) ENGINE=INNODB;

# --- !Downs

 DROP TABLE IF EXISTS item;

