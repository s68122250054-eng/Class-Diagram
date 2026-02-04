1.อธิบายหน้าที่ของแต่ละคลาส (Class Responsibility)
Department
ทำหน้าที่จัดการข้อมูลหน่วยงาน/แผนกในระบบ
ใช้เก็บชื่อแผนก และใช้เชื่อมโยงกับผู้ใช้งาน User

User
เป็นคลาสหลักของผู้ใช้งานระบบ
ทำหน้าที่, เข้าสู่ระบบ ,เพิ่ม / ดู / ยืนยัน Proposal ,ดู Report
จัดการข้อมูลแผนกบางบทบาท

Login
ทำหน้าที่จัดการกระบวนการเข้าสู่ระบบ
รับ username และ password เพื่อตรวจสอบสถานะการล็อกอิน

Proposal
ทำหน้าที่จัดการข้อเสนอโครงการ (Proposal)
เช่น การสร้าง แก้ไข ดูสถานะ อนุมัติ หรือปฏิเสธ Proposal

Applicant
เก็บข้อมูลผู้สมัครหรือผู้ยื่น Proposal
ใช้จัดการข้อมูลส่วนตัวของผู้สมัคร

Report
ทำหน้าที่สร้างและแสดงรายงาน
รายงานจะอ้างอิงจาก Proposal ที่มีอยู่ในระบบ

RoleUser (Enumeration)
กำหนดบทบาทของผู้ใช้งานในระบบ
เช่น PublicRelation, Division, Manager

Gender (Enumeration)
กำหนดเพศของ User และ Applicant
เช่น Male (M), Female (F)

StatusProposal (Enumeration)
กำหนดสถานะของ Proposal
เช่น Waiting, Rejected, Accepted

2. อธิบายความหมายของทุก Attribute
Department
department_id : int → รหัสแผนก
department_name : String → ชื่อแผนก

User
user_id : int → รหัสผู้ใช้
department_id : int → แผนกที่สังกัด
user_username : String → ชื่อผู้ใช้สำหรับล็อกอิน
user_password : String → รหัสผ่าน
user_name : String → ชื่อ-นามสกุล
user_gender : Gender → เพศ
user_email : String → อีเมล
user_role : RoleUser → บทบาทของผู้ใช้

Login
username : String → ชื่อผู้ใช้
password : String → รหัสผ่าน
Proposal
proposal_code : String → รหัส Proposal
proposal_title : String → ชื่อ Proposal
proposal_text : String → รายละเอียด Proposal
proposal_date : Date → วันที่ยื่น Proposal
proposal_status : StatusProposal → สถานะ Proposal (เริ่มต้น = Waiting)

Applicant
applicant_id : int → รหัสผู้สมัคร
applicant_name : String → ชื่อผู้สมัคร
applicant_job : String → อาชีพ
applicant_address : String → ที่อยู่
applicant_gender : Gender → เพศ
applicant_tel : char → เบอร์โทรศัพท์

Report
report_code : int → รหัสรายงาน
report_date : Date → วันที่สร้างรายงาน

Enumeration
RoleUser → PublicRelation, Division, Manager
Gender → Male = M, Female = F
StatusProposal → Waiting, Rejected, Accepted

3. อธิบายความหมายของทุก Method
Department
insertDepartment() → เพิ่มข้อมูลแผน
updateDepartment() → แก้ไขข้อมูลแผนก
deleteDepartment() → ลบข้อมูลแผนก

User
userLogin() → เข้าสู่ระบบ
addProposal() → เพิ่ม Proposal
viewProposal() → ดู Proposal
confirmProposal() → ยืนยัน Proposal
editReports() → แก้ไขรายงาน
viewReports() → ดูรายงาน
updateDepartment() → แก้ไขข้อมูลแผนก

Login
loginStatus() → ตรวจสอบสถานะการล็อกอิน (สำเร็จ/ไม่สำเร็จ)

Proposal
viewProposal() → แสดงรายละเอียด Proposal
viewStatus() → ดูสถานะ Proposal
updateProposal() → แก้ไข Proposal
deleteProposal() → ลบ Proposal
archiveProposal() → เก็บ Proposal เข้าคลัง
viewApplicant() → ดูข้อมูลผู้สมัคร

Applicant
insertApplicant() → เพิ่มข้อมูลผู้สมัคร
updateApplicant() → แก้ไขข้อมูลผู้สมัคร
deleteApplicant() → ลบข้อมูลผู้สมัคร

Report
viewReports() → แสดงรายงาน
createReports() → สร้างรายงาน

StatusProposal
changeStatus() → เปลี่ยนสถานะ Proposal

4. อธิบายความสัมพันธ์ (Relationship)
Department – User
Association
หนึ่งแผนกมีผู้ใช้หลายคน (1..*)
ผู้ใช้หนึ่งคนสังกัดได้เพียงหนึ่งแผนก (1)

User – Login
Association
ใช้ข้อมูล Login เพื่อตรวจสอบการเข้าสู่ระบบ

User – Proposal
Association
User 1 คน สามารถสร้าง Proposal ได้หลายรายการ (1..*)
Proposal หนึ่งรายการมี User ผู้สร้าง 1 คน

Proposal – Applicant
Composition
Proposal ต้องมี Applicant เสมอ
หากลบ Proposal ข้อมูล Applicant จะถูกลบไปด้วย

Proposal – StatusProposal
Association (ใช้ Enumeration)
Proposal มีสถานะตามที่กำหนดใน StatusProposal

User – RoleUser
Association (Enumeration)
User มีบทบาทเดียวต่อหนึ่งคน

User / Applicant – Gender
Association (Enumeration)
กำหนดเพศของบุคคล

Proposal – Report
Association
Proposal สามารถนำไปสร้าง Report ได้
Report อ้างอิงจาก Proposal
