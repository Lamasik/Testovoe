-- *********************************************************************
-- Update Database Script
-- *********************************************************************
-- Change Log: C:/Projects/ToDo/liquibase/db/master.xml
-- Ran at: 02.06.2022, 20:11
-- Against: postgres@jdbc:postgresql://localhost:5432/postgres
-- Liquibase version: 3.10.0
-- *********************************************************************

-- Lock Database
UPDATE databasechangeloglock SET LOCKED = TRUE, LOCKEDBY = 'DESKTOP-MFEC6VG (192.168.0.105)', LOCKGRANTED = '2022-06-02 20:11:00.496' WHERE ID = 1 AND LOCKED = FALSE;

-- Release Database Lock
UPDATE databasechangeloglock SET LOCKED = FALSE, LOCKEDBY = NULL, LOCKGRANTED = NULL WHERE ID = 1;

