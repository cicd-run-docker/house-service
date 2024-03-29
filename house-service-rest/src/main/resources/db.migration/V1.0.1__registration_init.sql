SET AUTOCOMMIT = 0;
SET FOREIGN_KEY_CHECKS = 0;

CREATE TABLE `boarding_house`
(
    `id`           int(11)     NOT NULL AUTO_INCREMENT,
    `version`      int(11)     NOT NULL,
    `create_at`    datetime    NOT NULL,
    `update_at`    datetime    NOT NULL,
    `user_id`      int(11)     NOT NULL,
    `user_name`    varchar(64) NOT NULL,
    `phone_number` varchar(64) NOT NULL,
    `house_name`   varchar(64) NOT NULL,
    `address`      varchar(64) NOT NULL,
    `room_number`  int(11)     NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

SET FOREIGN_KEY_CHECKS = 1;

COMMIT;