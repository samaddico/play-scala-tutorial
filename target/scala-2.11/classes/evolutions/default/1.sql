# --- Create category table.

# --- !Ups

CREATE TABLE category (
  id               BIGINT NOT NULL AUTO_INCREMENT,
  name             varchar(255) DEFAULT NULL,
  description      varchar(255) DEFAULT NULL,

  PRIMARY KEY (id )
) ENGINE=INNODB;

# --- !Downs

DROP TABLE IF EXISTS category;

