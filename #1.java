ArrayList<Integer> al = new ArrayList<>();
         Set<Integer> set = new HashSet<>();
         for(int x : b){
             set.add(x);
         }
         for(int x: a){
             if(!set.contains(x))
             al.add(x);
         }
         return al;
