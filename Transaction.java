class Transaction {
    private Session session;
    private double amount;
    private boolean isWithdrawal;

    public Transaction(Session session, double amount, boolean isWithdrawal) {
        this.session = session;
        this.amount = amount;
        this.isWithdrawal = isWithdrawal;
    }

    public void execute() {
        Account account = session.getCustomer().getAccount();
        if (isWithdrawal) {
            account.withdraw(amount);
        } else {
            account.deposit(amount);
        }
    }
}
