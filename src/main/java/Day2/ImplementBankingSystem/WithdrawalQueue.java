package Day2.ImplementBankingSystem;

import java.util.*;
public class WithdrawalQueue {

        private Queue<Integer> withdrawalQueue;

        public WithdrawalQueue() {
            this.withdrawalQueue = new LinkedList<>();
        }

        public void addWithdrawalRequest(int accountNumber) {
            withdrawalQueue.offer(accountNumber);
        }

        public Integer processNextWithdrawal() {
            return withdrawalQueue.poll();
        }

        public boolean hasPendingWithdrawals() {
            return !withdrawalQueue.isEmpty();
        }
    }

