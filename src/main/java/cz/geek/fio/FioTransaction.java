package cz.geek.fio;

import lombok.Data;
import java.time.LocalDate;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.GregorianCalendar;

@Data
public class FioTransaction {
    
    private String transactionId;
    private LocalDate date;
    private BigDecimal amount;
    private String currency;
    private String bankAccount;
    private String bankCode;
    private String bankName;
    private String userId;
    private String type;
    private String owner;
    private String comment;
    private long reuqestId;
    private String variableSymbol;
    private String constantSymbol;
    private String specificSymbol;

}
