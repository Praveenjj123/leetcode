select ei.unique_id,e.name 
from Employees e 
left join EmployeeUNI ei 
on e.id=ei.id
