//-- UseCOMObjects.bsl
&НаКлиенте
Процедура СоздатьЗаданиеПланировщика()
    // S_ONEC_011 Использование com-объектов x1
    ServicesSet = ПолучитьCOMОбъект("winmgmts:{impersonationLevel=impersonate}!" + РабочееМестоКлиента() + "\root\cimv2");
    // S_ONEC_011 Использование com-объектов x1
    ObjectSet = ПолучитьCOMОбъект("WinMgmts:Win32_ScheduledJob");
КонецПроцедуры

//== UseCOMObjects.bsl
