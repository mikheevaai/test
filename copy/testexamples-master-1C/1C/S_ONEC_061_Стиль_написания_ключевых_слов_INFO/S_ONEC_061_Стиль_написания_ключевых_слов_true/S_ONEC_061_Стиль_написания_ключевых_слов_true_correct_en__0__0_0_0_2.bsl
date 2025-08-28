Procedure ПроверкаСтиля()

    Value = True;

    // S_ONEC_054 Отсутствие конструкции «Иначе» в условном операторе x1
    // S_ONEC_035 Сравнение с булевым литералом x1
    If Value <> True Then
        Обработать();
    ElsIf True Then
        Обработать();
    EndIf;

    ПроверитьЗначение(True);

EndProcedure
