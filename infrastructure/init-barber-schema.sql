DO $$
BEGIN
    IF NOT EXISTS(
       SELECT schema_name
       FROM information_schema.schemata
       WHERE schema_name = 'barber_schema'
    ) THEN
       EXECUTE 'CREATE SCHEMA barber_schema';
    END IF;
END
$$
