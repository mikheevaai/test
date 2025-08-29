## Описание проверки
**Релиз:**
**ID:** S_ONEC_032
**Язык:** 1С
**Критичность:** ERROR
**Категория:** 

### Название 
Некорректная проверка прав доступа
### Описание 
Использование метода РольДоступна для проверки прав доступа снижает устойчивость кода к пересмотру состава ролей в конфигурации.

### Угрозы 
- Обход концепции ролей и полномочий.
### Рекоммендации 
- Использование метода ПравоДоступа для проверки прав доступа позволяет повысить устойчивость кода к пересмотру состава ролей в конфигурации.
### Пример 
``` 
Если РольДоступна("ДобавлениеИзменениеСтранМира") Тогда
	СтандартнаяОбработка = Ложь;
	СсылкаДляПереходаНаКарту = КонтактнаяИнформацияМедПредыКлиентСервер
		.СтрокаСсылкиПоказатьНаКарте();
КонецЕсли
``` 
### Ссылки
- [CVSS:3.1/AV:N/AC:L/PR:L/UI:N/S:C/C:H/I:H/A:H/E:H/RC:C/CR:H/IR:H/AR:H = 9.9](https://www.first.org/cvss/calculator/3.1#CVSS:3.1/AV:N/AC:L/PR:L/UI:N/S:C/C:H/I:H/A:H/E:H/RC:C/CR:H/IR:H/AR:H)
- [MITRE CWE-250](https://cwe.mitre.org/data/definitions/250.html)
- [MITRE CWE-279](https://cwe.mitre.org/data/definitions/279.html)
- [MITRE CWE-281](https://cwe.mitre.org/data/definitions/281.html)
- [MITRE CWE-285](https://cwe.mitre.org/data/definitions/285.html)
- [MITRE CWE-732](https://cwe.mitre.org/data/definitions/732.html)
- [OWASP TOP-10 A01_2021](https://owasp.org/Top10/A01_2021-Broken_Access_Control/)

---
## Примечание
