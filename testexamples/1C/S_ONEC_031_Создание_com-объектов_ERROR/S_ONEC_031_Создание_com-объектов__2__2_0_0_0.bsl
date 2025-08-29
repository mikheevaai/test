//-- CreateCOMObjects.bsl
&НаКлиенте
Процедура СоздатьЗаданиеПланировщика()
    // S_ONEC_031 Создание com-объектов x1
    ShellApplication = Новый COMОбъект("Application");
    // S_ONEC_031 Создание com-объектов x1
    Connection = Новый COMОбъект("ADODB.Connection");
КонецПроцедуры
//== CreateCOMObjects.bsl
