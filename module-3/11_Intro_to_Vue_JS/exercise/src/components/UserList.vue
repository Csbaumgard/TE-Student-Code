<template>
  <table id="tblUsers">
    <thead>
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Username</th>
        <th>Email Address</th>
        <th>Status</th>
    </tr>
    </thead>
    <tbody>
      <tr>
        <td><input type="text" id="firstNameFilter"/></td>
        <td><input type="text" id="lastNameFilter"/></td>
        <td><input type="text" id="usernameFilter"/></td>
        <td><input type="text" id="emailFilter"/></td>
        <td>
          <select id="statusFilter">
            <option value="">Show All</option>
            <option value="Active">Active</option>
            <option value="Disabled">Disabled</option>
          </select>
        </td>
      </tr>
      <!-- user listing goes here -->
      <tr class="users" v-for="user in users" v-bind:key="user.id">
        <div class="first-name">
          {{ user.firstName }}
        </div>
        <div class="last-name">
          {{ user.lastName }}
        </div>
        <div class="username">
          {{ user.username }}
        </div>
        <div class="email">
          {{ user.emailAddress }}
        </div>
        <div class="status">
          {{ user.status }}
        </div>
      </tr>
    </tbody>
  </table>
</template>

<script>
export default {
  name: 'user-list',
  data() {
    return {
      users: [
        { id: 1, firstName: 'John', lastName: 'Smith', username: 'jsmith', emailAddress: 'jsmith@gmail.com', status: 'Active' },
        { id: 2, firstName: 'Anna', lastName: 'Bell', username: 'abell', emailAddress: 'abell@yahoo.com', status: 'Active' },
        { id: 3, firstName: 'George', lastName: 'Best', username: 'gbest', emailAddress: 'gbest@gmail.com', status: 'Disabled' },
        { id: 4, firstName: 'Ben', lastName: 'Carter', username: 'bcarter', emailAddress: 'bcarter@gmail.com', status: 'Active' },
        { id: 5, firstName: 'Katie', lastName: 'Jackson', username: 'kjackson', emailAddress: 'kjackson@yahoo.com', status: 'Active' },
        { id: 6, firstName: 'Mark', lastName: 'Smith', username: 'msmith', emailAddress: 'msmith@foo.com', status: 'Disabled' }
      ]
    }
  }
}
</script>

<style scoped>
table {
  margin-top: 20px;
  font-family:-apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif
}
th {
  text-transform: uppercase
}
td {
  padding: 10px;
}
tr.disabled {
  color: red;
}
input, select {
  font-size: 16px;
}
</style>
