## Описание проверки
**Релиз:**
**ID:** S_ONEC_041
**Язык:** 1С
**Критичность:** INFO
**Категория:** 

### Название 
Слишком длинное имя объекта
### Описание 
Имена переменных, функций или процедур не должны превышать 80 символов. Кроме проблем с использованием этих объектов могут возникать проблемы с их обработкой.

### Угрозы 
- Ухудшение качества кода.
### Рекоммендации 
- Не используйте имена длинной больше 80 символов.
### Пример 
``` 
ДлиииииииииииииииииииииииииииииииииииииииииииииииииииииииииииииинноеИмяДокумента();
``` 
### Ссылки
- [CVSS:3.1/AV:N/AC:H/PR:L/UI:R/S:U/C:N/I:L/A:N/E:H/RC:C = 2.6](https://www.first.org/cvss/calculator/3.1#CVSS:3.1/AV:N/AC:H/PR:L/UI:R/S:U/C:N/I:L/A:N/E:H/RC:C)
- [MITRE CWE-22](https://cwe.mitre.org/data/definitions/22.html)
- [MITRE CWE-130](https://cwe.mitre.org/data/definitions/130.html)
- [MITRE CWE-228](https://cwe.mitre.org/data/definitions/228.html)
- [MITRE CWE-805](https://cwe.mitre.org/data/definitions/805.html)
- [1C](https://1c.ru/rus/products/1c/predpr/compat/soft/requirements.htm)

---
## Примечание
