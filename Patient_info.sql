use hospital_management_system;
CREATE TABLE Patient_info (
    ID INT PRIMARY KEY,         -- Unique identifier for each patient
    Number VARCHAR(15),         -- Contact number or any identifying number (use appropriate length)
    Name VARCHAR(50) NOT NULL,  -- Patient's name (adjust length as needed)
    Disease VARCHAR(50),        -- Disease or diagnosis information
    Room INT,                   -- Room number assigned to the patient
    Deposit DECIMAL(10, 2)      -- Deposit amount with 2 decimal places
);

INSERT INTO Patient_info (ID, Number, Name, Disease, Room, Deposit) VALUES
(1, '1234567890', 'John Doe', 'Flu', 101, 500.00),
(2, '0987654321', 'Jane Smith', 'Pneumonia', 102, 1500.00),
(3, '1122334455', 'Alice Johnson', 'Diabetes', 103, 2000.00),
(4, '5566778899', 'Bob Brown', 'Hypertension', 104, 1000.00);

select * from Patient_info;

ALTER TABLE Patient_info
ADD Time TIME;

UPDATE Patient_info SET Time = '10:30:00' WHERE ID = 1;
UPDATE Patient_info SET Time = '11:45:00' WHERE ID = 2;
UPDATE Patient_info SET Time = '14:20:00' WHERE ID = 3;
UPDATE Patient_info SET Time = '16:05:00' WHERE ID = 4;

