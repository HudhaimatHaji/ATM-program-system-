class Session {
    private Customer customer;
    private ATM atm;

    public Session(Customer customer, ATM atm) {
        this.customer = customer;
        this.atm = atm;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public ATM getATM() {
        return this.atm;
    }
}
