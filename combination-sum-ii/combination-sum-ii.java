                           List<int[]> counter,
                           List<List<Integer>> results) {
​
        if (remain == 0) {
            // make a deep copy of the current combination.
            results.add(new ArrayList<Integer>(comb));
            return;
        }
​
        for (int nextCurr = curr; nextCurr < counter.size(); ++nextCurr) {
            int[] entry = counter.get(nextCurr);
            Integer candidate = entry[0], freq = entry[1];
​
            if (freq <= 0)
                continue;
​
            // add a new element to the current combination
            if(remain-candidate>=0){
            comb.addLast(candidate);
            counter.set(nextCurr, new int[]{candidate, freq - 1});
​
            // continue the exploration with the updated combination
            backtrack(comb, remain - candidate, nextCurr, counter, results);
​
            // backtrack the changes, so that we can try another candidate
            counter.set(nextCurr, new int[]{candidate, freq});
            comb.removeLast();
            }
        }
    }
}
​
