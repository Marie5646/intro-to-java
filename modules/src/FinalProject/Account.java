package FinalProject;

import java.util.ArrayList;

public class Account {
    private long accountId;
    private ArrayList<Claim> claims; // List of claims
    private String coverageTier;
    private User user;

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public ArrayList<Claim> getClaims() {
        return claims;
    }

    public void setClaims(ArrayList<Claim> claims) {
        this.claims = claims;
    }

    public String getCoverageTier() {
        return coverageTier;
    }

    public void setCoverageTier(String coverageTier) {
        this.coverageTier = coverageTier;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public static void main(String[] args) {
        //New Account
        Account account = new Account();
        account.setAccountId(101);
        account.setCoverageTier("Gold");

        //Claims
        ArrayList<Claim> claims = new ArrayList<>();
        Claim claim1 = new Claim();
        claim1.setClaimId(1);
        claims.add(claim1);

        Claim claim2 = new Claim();
        claim2.setClaimId(2);
        claims.add(claim2);

        account.setClaims(claims);

        //User account
        User user = new User();
        user.setFirstName("Charlie");
        user.setLastName("Brown");
        account.setUser(user);

        //Account details
        System.out.println("Account Details");
        System.out.println("Account ID" + account.getAccountId());
        System.out.println("Coverage Tier" + account.getCoverageTier());
        System.out.println("User" + account.getUser().getFirstName() + " " + account.getUser().getLastName());
        System.out.println("Claims");
        for (Claim claim : account.getClaims()) {
            System.out.println("  Claim ID" + claim.getClaimId());
        }
    }

}
